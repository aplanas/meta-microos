SUMMARY = "Apache Log4j JMX GUI"
DESCRIPTION = "Swing-based client for remotely editing the log4j configuration and remotely \
monitoring StatusLogger output. Includes a JConsole plug-in."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-jmx-gui-2.17.2-5.8.noarch.rpm"
RPM_HASH = "94226896adf74086004a71d690f9cebd1b3498dd7073172fa7a5fed596d68ae9182a363845cbc8b45636e42a2329448292612ed1c62a22146a07749fecbf137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-jmx-gui \
mvn-org.apache.logging.log4j-log4j-jmx-gui \
mvn-org.apache.logging.log4j-log4j-jmx-gui-pom- \
osgi-org.apache.logging.log4j.jmx-gui"

RDEPENDS:${PN} += "/usr/bin/bash \
java-devel \
java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core"

inherit rpm
