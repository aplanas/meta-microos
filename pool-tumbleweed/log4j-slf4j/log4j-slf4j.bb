SUMMARY = "Binding between LOG4J 2 API and SLF4J"
DESCRIPTION = "Binding between LOG4J 2 API and SLF4J."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-slf4j-2.17.2-5.7.noarch.rpm"
RPM_HASH = "7be6436a9e0c3feb67d221446f41d2cbc658d1ee7b78757e76eca0fcabc3d0f900cdecf9980a0fb8e4b8eea4b5a5b2b504e95abba7b5f83303c7cd52199f2d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-slf4j \
mvn-org.apache.logging.log4j-log4j-slf4j-impl \
mvn-org.apache.logging.log4j-log4j-slf4j-impl-pom- \
mvn-org.apache.logging.log4j-log4j-to-slf4j \
mvn-org.apache.logging.log4j-log4j-to-slf4j-pom- \
osgi-org.apache.logging.log4j.slf4j-impl \
osgi-org.apache.logging.log4j.to-slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.slf4j-slf4j-api"

inherit rpm
