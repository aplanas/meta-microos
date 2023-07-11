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

RPM_NAME = "mysql-connector-java-8.0.33-3.2.noarch.rpm"
RPM_HASH = "581d256072facf8a5dffea2ac7d77500703518f81e2d713dcba22cb1bb5efeca39110b114b9b8491ea71071e9a6484d3ea1bc616d7d825e38b8bd65075635c21"
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
