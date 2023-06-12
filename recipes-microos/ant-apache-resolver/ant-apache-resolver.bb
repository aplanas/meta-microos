SUMMARY = "Optional apache resolver tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache resolver tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-resolver-1.10.13-2.1.noarch.rpm"
RPM_HASH = "939eb33c20d4f01f352c71073461852bafdc91f231292a263722fbc24ad154e06385e3f6e883a9e3a557cd30a769606752e2d871dbb70d553a6e702877e4db69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-resolver \
config(ant-apache-resolver) \
mvn(org.apache.ant:ant-apache-resolver) \
mvn(org.apache.ant:ant-apache-resolver:pom:)"
RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(xml-resolver:xml-resolver) \
xml-resolver"

inherit rpm
