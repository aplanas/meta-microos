SUMMARY = "Apache Maven JLink Plugin"
DESCRIPTION = "The Maven JLink Plugin is intended to create Modular Run-Time Images. \
http://openjdk.java.net/jeps/282, http://openjdk.java.net/jeps/220"
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jlink-plugin-3.0.0~alpha1-2.22.noarch.rpm"
RPM_HASH = "a4967a3a2f8a67175e9a68d13c573dadb1892b2804f7c90d404b69737555f13bf72e85bd2b4c3bf50bb9e050f66706b055faf30de412e4236024bc6fb48a3696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin \
mvn-org.apache.maven.plugins-maven-jlink-plugin \
mvn-org.apache.maven.plugins-maven-jlink-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-java"

inherit rpm
