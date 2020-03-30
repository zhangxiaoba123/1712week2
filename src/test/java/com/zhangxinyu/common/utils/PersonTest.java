package com.zhangxinyu.common.utils;


import org.junit.jupiter.api.Test;

public class PersonTest {

	@Test
	public  void test1() {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			//姓名属性值调用StringUtil.generateChineseName()创建（4分）
			String name = StringUtil.generateChineseName();
			p.setName(name);
			//年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
			int i1 = RandomUtil.random(1, 120);
			p.setAge(i1);
			//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
			String string = StringUtil.randomChineseString(140);
			p.setAbout(string);
			//注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
			/*
			 * Calendar c = Calendar.getInstance(); c.set(2010, 0, 5); Date date =
			 * c.getTime(); System.err.println(date);
			 */
			
			System.out.println(i+""+p);

			
		}
		
		
	}
}
