SUMMARY = "Maven Plugin Tools Generators"
DESCRIPTION = "The Maven Plugin Tools Generators provides content generation \
(documentation, help) from plugin descriptor."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-generators-3.6.0-5.2.noarch.rpm"
RPM_HASH = "017e29fcd871dc6ae7d057a40bd7bcaf2f959e7a6b42ed0c627a1d176964f05ca2a8825ebd4e79eea828c12eccf920d4dc976bec88d979cd145c3aaf8db0209d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.jtidy-jtidy \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
