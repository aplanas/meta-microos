SUMMARY = "Optional swing tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional swing tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-swing-1.10.14-1.1.noarch.rpm"
RPM_HASH = "7cf1e30ea88e8e6acdbb01436c9dc2f96a6d6eeb12af5905efd9a4fc87a4940b5841d70baa647363aa216cbf085941a912bd51685e7b78bbd87a700ce60b01d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-swing \
config-ant-swing \
mvn-org.apache.ant-ant-swing \
mvn-org.apache.ant-ant-swing-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
