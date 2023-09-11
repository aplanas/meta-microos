SUMMARY = "Maven Plugin Tools Generators"
DESCRIPTION = "The Maven Plugin Tools Generators provides content generation \
(documentation, help) from plugin descriptor."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-generators-3.6.0-7.1.noarch.rpm"
RPM_HASH = "15f51b20f359fa6a9b878d52abd93cc189c882d9f9477dc1eeee40d2d4d5cd051e54d49bbf166ce4b72778b7b1987abf7c1c3fd5fc42f92a7189303b7b9c9b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
