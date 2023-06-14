SUMMARY = "Commons Daemon - Controlling of Java Daemons"
DESCRIPTION = "The Daemon Component contains a set of Java and native code, including \
a set of Java interfaces applications must implement and Unix native \
code to control a Java daemon from a Unix operating system."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "apache-commons-daemon-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "9bbcc1b5930b755282dfba532eb0ef367ff0fd712988a4f1194e65a520df6b4556558d3400e39bc15b22635c2b6a8d0edb5f5504592f3ed9feeebbdb4d41a7a7"

RPROVIDES:${PN} += "apache-commons-daemon \
jakarta-commons-daemon \
jakarta-commons-daemon-java \
mvn-commons-daemon-commons-daemon \
mvn-commons-daemon-commons-daemon-pom- \
mvn-org.apache.commons-commons-daemon \
mvn-org.apache.commons-commons-daemon-pom- \
osgi-org.apache.commons.commons-daemon"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
