SUMMARY = "Optional apache resolver tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache resolver tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-resolver-1.10.13-2.2.noarch.rpm"
RPM_HASH = "9ad8d013095b1d8adabff4a4337ead7b8d5b1122ed8853d405950966f8134a25bf3cb1f59267a2a03c2ac4c4523298d6224141a799df89589dc29f2f23c6d68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-resolver \
config-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xml-resolver-xml-resolver \
xml-resolver"

inherit rpm
