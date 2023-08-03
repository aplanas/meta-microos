SUMMARY = "Maven Plugin Tools Generators"
DESCRIPTION = "The Maven Plugin Tools Generators provides content generation \
(documentation, help) from plugin descriptor."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-generators-3.6.0-6.1.noarch.rpm"
RPM_HASH = "53d493832b6bdb4b2e23692030c365f59498a03d2844997487bc58ae8e26e72dc5f62df0c6569bc5c47c387bae7283c0bce0e7c72b8a4cef58cbdfd1b12eb8cc"
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
