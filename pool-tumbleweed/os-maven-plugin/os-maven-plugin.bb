SUMMARY = "Maven plugin for generating platform-dependent properties"
DESCRIPTION = "os-maven-plugin is a Maven extension/plugin that generates various \
useful platform-dependent project properties normalized from \
${os.name} and ${os.arch}. \
 \
${os.name} and ${os.arch} are often subtly different between JVM and \
operating system versions or they sometimes contain machine-unfriendly \
characters such as whitespaces. This plugin tries to remove such \
fragmentation so that you can determine the current operating system \
and architecture reliably."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-maven-plugin-1.7.0-3.9.noarch.rpm"
RPM_HASH = "4df66ee5c02d35d1a2a73c605407d3d2d157b78fdf279f7bf6d774d12234c8d54fc2fda5d519099e8abb458fb8e3bb720c04184f371a05985f34ab66eb959167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-kr.motd.maven-os-maven-plugin \
mvn-kr.motd.maven-os-maven-plugin-pom- \
os-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
