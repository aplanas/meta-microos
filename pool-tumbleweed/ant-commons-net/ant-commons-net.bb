SUMMARY = "Optional commons net tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons net tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-commons-net-1.10.14-1.1.noarch.rpm"
RPM_HASH = "26c9c2408552d465ed04819c16ce6c4a7a1638019f8eac1670a359e4b1df6bbb33c709f30ee5afe7bacfec3199ec8e7cf12608cd4a37803538efe85940b8b4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-net \
config-ant-commons-net \
mvn-org.apache.ant-ant-commons-net \
mvn-org.apache.ant-ant-commons-net-pom-"

RDEPENDS:${PN} += "ant \
apache-commons-net \
java-headless \
javapackages-filesystem \
mvn-commons-net-commons-net \
mvn-org.apache.ant-ant"

inherit rpm
