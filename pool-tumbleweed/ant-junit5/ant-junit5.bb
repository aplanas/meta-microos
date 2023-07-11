SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit5 tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-junit5-1.10.13-2.2.noarch.rpm"
RPM_HASH = "346c6bcd6a53af8800adb74a9b7eb48b271115f927f53e1e0b99ec1a9c48e5cf721974b49fbdef686eee479719f9e19c5d25cfb3ccaff11059020e3bcc8fddf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit5 \
config-ant-junit5 \
mvn-org.apache.ant-ant-junitlauncher \
mvn-org.apache.ant-ant-junitlauncher-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit5 \
mvn-org.apache.ant-ant \
mvn-org.junit.platform-junit-platform-launcher"

inherit rpm
