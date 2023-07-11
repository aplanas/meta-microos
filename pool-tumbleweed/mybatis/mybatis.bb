SUMMARY = "SQL Mapping Framework for Java"
DESCRIPTION = "The MyBatis data mapper framework makes it easier \
to use a relational database with object-oriented \
applications. MyBatis couples objects with stored \
procedures or SQL statements using a XML descriptor \
or annotations. Simplicity is the biggest advantage \
of the MyBatis data mapper over object relational \
mapping tools. \
 \
To use the MyBatis data mapper, you rely on your \
own objects, XML, and SQL. There is little to \
learn that you don't already know. With the \
MyBatis data mapper, you have the full power of \
both SQL and stored procedures at your fingertips. \
 \
The MyBatis project is developed and maintained by \
a team that includes the original creators of the \
'iBATIS' data mapper. The Apache project was retired \
and continued here."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "mybatis-3.5.6-6.4.noarch.rpm"
RPM_HASH = "6d528a258d93c791a4e42cabfb3f87ec46aa3964612fa2941f00704f8ff6322c65952acf27d9e127c6c74fb7611c5ec85eb65ff988818ac0e94b5029ed5d9690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-mybatis \
mvn-org.mybatis-mybatis \
mvn-org.mybatis-mybatis-pom- \
mybatis \
osgi-org.mybatis.mybatis"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
