SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-junit-1.10.14-1.1.noarch.rpm"
RPM_HASH = "52012ac6def45a96e1731332c3d2bdb0db817e302b547f94949d3bb7a7beb23b5d4bc14183da86d52e95b05f1c0d739a0d7d9fe443bee56fc2647f3cf92026d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit \
config-ant-junit \
mvn-org.apache.ant-ant-junit \
mvn-org.apache.ant-ant-junit-pom- \
mvn-org.apache.ant-ant-junit4 \
mvn-org.apache.ant-ant-junit4-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit4 \
mvn-junit-junit \
mvn-org.apache.ant-ant"

inherit rpm
