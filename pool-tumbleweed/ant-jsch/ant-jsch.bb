SUMMARY = "Optional jsch tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jsch tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jsch-1.10.13-2.2.noarch.rpm"
RPM_HASH = "9ed59e667e3bb12d406a0e3015ae4698f1e369e82ca2b902ca764874b7612eec1a0c27a4acf1d2d02842b37ab5d8d8fe937b29887618044a2dab445f63109837"
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
