SUMMARY = "Optional javamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional javamail tasks for Apache Ant."
LICENSE = "CDDL-1.0"

PV = "1.10.13"

RPM_NAME = "ant-javamail-1.10.13-2.2.noarch.rpm"
RPM_HASH = "9ade455320b5dee0628a721ae467fe51e14ad277c60a843a6f79782a2fa9bb4f11e3bfc5f59ba2e84dd060d08ab83fbea7a54f264f1106d5d16a79b7de5c5856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-javamail \
config-ant-javamail \
mvn-org.apache.ant-ant-javamail \
mvn-org.apache.ant-ant-javamail-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javamail \
javapackages-filesystem \
mvn-com.sun.mail-javax.mail \
mvn-org.apache.ant-ant"

inherit rpm
