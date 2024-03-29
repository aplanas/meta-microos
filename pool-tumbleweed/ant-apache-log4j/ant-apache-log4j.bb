SUMMARY = "Optional apache log4j tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache log4j tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-log4j-1.10.14-1.1.noarch.rpm"
RPM_HASH = "432c6f2b7f44e5b64433a8fc149256814ecf78f1515c5337d16df09a909e0e7bca8de4eaff5f2cf0b9c556088ad4e7a66a3107cd7b50ee7caf4f1765cd40d3c0"
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
