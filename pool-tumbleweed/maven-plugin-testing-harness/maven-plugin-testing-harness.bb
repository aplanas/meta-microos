SUMMARY = "Maven Plugin Testing Mechanism"
DESCRIPTION = "The Maven Plugin Testing Harness provides mechanisms to manage tests on Mojo."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-harness-3.3.0-5.13.noarch.rpm"
RPM_HASH = "d379edcf086a4aa47ce0615ee8a345be7bb5b3e929088a15773a938411b76fb8fff07f015fe6134c0f7f9c37cd6afd220d32279ba61b0b858c388f2bb140c21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing-harness \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-harness-pom- \
mvn-org.apache.maven.shared-maven-plugin-testing-harness \
mvn-org.apache.maven.shared-maven-plugin-testing-harness-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.codehaus.plexus-plexus-archiver"

inherit rpm
