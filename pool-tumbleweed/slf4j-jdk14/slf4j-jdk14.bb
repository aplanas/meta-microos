SUMMARY = "SLF4J JDK14 Binding"
DESCRIPTION = "SLF4J JDK14 Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jdk14-1.7.36-4.2.noarch.rpm"
RPM_HASH = "47ae527edd30147c6919e5901c3623484bb288f0681e56937b566fe5d5cccbe322aa0271d9250ff2ba174f3a2b6f994d2e73992edf2e47b4b3277206170e4b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-jdk14 \
mvn-org.slf4j-slf4j-jdk14-pom- \
osgi-slf4j.jdk14 \
slf4j-jdk14"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
