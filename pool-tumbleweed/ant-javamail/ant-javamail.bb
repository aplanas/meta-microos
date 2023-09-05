SUMMARY = "Optional javamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional javamail tasks for Apache Ant."
LICENSE = "CDDL-1.0"

PV = "1.10.14"

RPM_NAME = "ant-javamail-1.10.14-1.1.noarch.rpm"
RPM_HASH = "c70d70070f81f6db3e8f0284d1b5b6260f75046edc7ecae6aaa9e5245a8308467823061f318b0c09475c75215ff2d6eb1719f0a7295d7aa6072c9f59d9e3bf16"
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
