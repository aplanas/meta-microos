SUMMARY = "Optional jsch tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jsch tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-jsch-1.10.14-1.1.noarch.rpm"
RPM_HASH = "2c268aab9f10b3b52ed308178f4e00efcb1e77943c742ddda75f278d3730a6b1393568c9a9d2969314c631f042755561268a3fe45f1baecde9caf48140378588"
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
