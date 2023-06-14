SUMMARY = "Official JDBC Driver for MySQL"
DESCRIPTION = "MySQL Connector/J is a native Java driver that converts JDBC (Java \
Database Connectivity) calls into the network protocol used by the \
MySQL database. It lets developers working with the Java programming \
language easily build programs and applets that interact with MySQL and \
connect all corporate data, even in a heterogeneous environment. MySQL \
Connector/J is a Type IV JDBC driver and has a complete JDBC feature \
set that supports the capabilities of MySQL."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.33"

RPM_NAME = "mysql-connector-java-8.0.33-2.1.noarch.rpm"
RPM_HASH = "038c27e99e7392463e3bb44d20f766bcea06f1ac00ef5149889e2b3b4d450eb47eed5368003066190169e27e34057b554d6eb149eb21320426065f932ed5a53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm.mysql \
mvn-com.mysql-mysql-connector-j \
mvn-com.mysql-mysql-connector-j-pom- \
mysql-connector-j \
mysql-connector-java \
mysql-connector-java-manual \
osgi-com.mysql.cj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jta \
mvn-com.google.protobuf-protobuf-java \
reload4j \
slf4j"

inherit rpm
