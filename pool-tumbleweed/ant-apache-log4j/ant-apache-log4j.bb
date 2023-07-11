SUMMARY = "Optional apache log4j tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache log4j tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-log4j-1.10.13-2.2.noarch.rpm"
RPM_HASH = "c52db56d01de83f07f2d3bf91cbb26f9c1692c5d73a9b1f32a920d89827b4abf94e124789b03f75772761a38f1da58a709235965925930b30afbb5691f7ddc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-log4j \
ant-jakarta-log4j \
config-ant-apache-log4j \
mvn-org.apache.ant-ant-apache-log4j \
mvn-org.apache.ant-ant-apache-log4j-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-log4j-log4j \
mvn-org.apache.ant-ant \
reload4j"

inherit rpm
