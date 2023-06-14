SUMMARY = "Optional jsch tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jsch tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jsch-1.10.13-2.1.noarch.rpm"
RPM_HASH = "935c0d3a807051b16ee4eb769e51a793db93b51ebe155f05fb2817d3f73a2dce6a95817b9cc87f5930d21687403e328f432263840a302fd179f8e4efc01183bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jsch \
config-ant-jsch \
mvn-org.apache.ant-ant-jsch \
mvn-org.apache.ant-ant-jsch-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
jsch \
mvn-com.jcraft-jsch \
mvn-org.apache.ant-ant"

inherit rpm
