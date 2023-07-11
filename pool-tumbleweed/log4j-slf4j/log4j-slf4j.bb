SUMMARY = "Binding between LOG4J 2 API and SLF4J"
DESCRIPTION = "Binding between LOG4J 2 API and SLF4J."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-slf4j-2.17.2-5.8.noarch.rpm"
RPM_HASH = "beab69ccdac9dd8ae317aebf5bc8fab4167618c8f5fc0321fd2219f1f29b6ab5f7540750aefb34e61528dff8e1ffff764b3200fde80c7e8c07dc07d87384ef3e"
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
