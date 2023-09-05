SUMMARY = "Optional jdepend tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jdepend tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-jdepend-1.10.14-1.1.noarch.rpm"
RPM_HASH = "9d3d5285614f791029afbccc4c6a29db6fdbf92b89fe069df3a0837346bd2f6fa79e42667f588fa97838883d053a65f2af25154ed3acb9f1f46f566c3b1ffcc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jdepend \
config-ant-jdepend \
mvn-org.apache.ant-ant-jdepend \
mvn-org.apache.ant-ant-jdepend-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
jdepend \
mvn-jdepend-jdepend \
mvn-org.apache.ant-ant"

inherit rpm
