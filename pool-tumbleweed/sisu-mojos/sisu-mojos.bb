SUMMARY = "Sisu plugin for Apache Maven"
DESCRIPTION = "The Sisu Plugin for Maven provides mojos to generate \
META-INF/sisu/javax.inject.Named index files for the Sisu container."
LICENSE = "EPL-1.0"

PV = "0.9.0~M2"

RPM_NAME = "sisu-mojos-0.9.0~M2-1.1.noarch.rpm"
RPM_HASH = "50ff38c77f5bda4e95c9da0b1d9bf6e3bb83e713aac636c50e22d1eafdacb1e004844dca919a61c59efafe4ded83f1ca323293a9f79ae6f049e41ccd726ccc6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-sisu-maven-plugin \
mvn-org.eclipse.sisu-sisu-maven-plugin-pom- \
mvn-org.sonatype.plugins-sisu-maven-plugin \
mvn-org.sonatype.plugins-sisu-maven-plugin-pom- \
sisu-mojos"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.slf4j-slf4j-nop \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
