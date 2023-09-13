SUMMARY = "Official JDBC Driver for MySQL"
DESCRIPTION = "MySQL Connector/J is a native Java driver that converts JDBC (Java \
Database Connectivity) calls into the network protocol used by the \
MySQL database. It lets developers working with the Java programming \
language easily build programs and applets that interact with MySQL and \
connect all corporate data, even in a heterogeneous environment. MySQL \
Connector/J is a Type IV JDBC driver and has a complete JDBC feature \
set that supports the capabilities of MySQL."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "mysql-connector-java-8.1.0-1.1.noarch.rpm"
RPM_HASH = "a460fbf3970bcdd78812b28e00f9573a3831d22ed2634d0bd1118727a12ae25921b886a666ae7444620462eafdda02aff7721c6d226955da756b7f01ec30cc4c"
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
