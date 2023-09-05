SUMMARY = "Optional apache bcel tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bcel tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-bcel-1.10.14-1.1.noarch.rpm"
RPM_HASH = "3f176a31d38db2a7701fe4c8273be35a77d793deeb434e10aa07b5850325cfe807ca794144ec9e3cfc9c116efb872464261b67d34e2d417a9df0caf65a250382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bcel \
ant-jakarta-bcel \
config-ant-apache-bcel \
mvn-org.apache.ant-ant-apache-bcel \
mvn-org.apache.ant-ant-apache-bcel-pom-"

RDEPENDS:${PN} += "ant \
bcel \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.bcel-bcel"

inherit rpm
