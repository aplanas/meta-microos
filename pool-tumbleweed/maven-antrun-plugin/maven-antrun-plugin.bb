SUMMARY = "Maven AntRun Plugin"
DESCRIPTION = "This plugin provides the ability to run Ant tasks from within Maven. \
It is even possible to embed Ant scripts in the POM."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-antrun-plugin-3.0.0-1.11.noarch.rpm"
RPM_HASH = "a8b80e9955789bfab6690e6cf0005d6e720bb8a61429f89db9f4d7f2adccdcba214535d63edbffcf7e5d55028bab9d2b1b3c12745fd0ee901345ef3a71b24931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-antrun-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
