SUMMARY = "Optional apache bcel tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bcel tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-bcel-1.10.13-2.2.noarch.rpm"
RPM_HASH = "8b03bd766e01ec6167336e0033ab791c23204ec063896ce4417bbfdc3dd2e13006b904897ea7a0119b7d5efc05a2fb0a23d3d86194c2a49b0bd7b40fa3df1a5d"
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
