package com.theironyard.clt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Things!");
    }
}
public class Person {
    private String name;
    private String eyeColor;
    private int age;

    Person(String name, String eyeColor, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
    }
    public void setAge(age) {
        this.age = age;
        if int age < 0
                return String("no");
        else if int age > 130
                return String("dust");
    }
    public int getAge() {
        return this.age;
    }
    public void setName(name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setEyeColor(eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getEyeColor() {
        return this.eyeColor;
    }
}


public class Car {
    private String color;
    private int speed;
    private String type;

    Car(String color, int speed, String type) {
        this.color = color;
        this.speed = speed;
        this.type = type;
    }
    public void setColor(color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(speed) {
        this.speed = speed;
        if int speed < 20
            return String("too slow");
        else if int speed > 350
            return String("car, not plane!");
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setType(type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}


public class Building {
    private int height;
    private String shape;
    private String location;

    Building(int height, String shape, String location) {
        this.height = height;
        this.shape = shape;
        this.location = location;
    }
    public void setHeight(height) {
        this.height = height;
        if int height < 1
                return String("foundation");
        else if int height > 730
                return String("Space Elevator");
    }
    public int getHeight() {
        return this.height;
    }
    public void setShape(shape) {
        this.shape = shape;
    }
    public String getShape() {
        return this.shape;
    }
    public void setLocation(location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }
}