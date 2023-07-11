SUMMARY = "Jetty build support files"
DESCRIPTION = "Build Support for Jetty. Contains enforcer rules, PMD rulesets, etc."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-1.5-2.10.noarch.rpm"
RPM_HASH = "89fc3bd70b0f741288106e3a843950c6e71551f8ca33263c965dffc97531c5c8eed39a745595086bb806c0f87d3c6f94d44bc6a7cca055af1c3167c26bb2a9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support \
mvn-org.eclipse.jetty.toolchain-jetty-build-support \
mvn-org.eclipse.jetty.toolchain-jetty-build-support-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.plugins-maven-shade-plugin \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.junit.jupiter-junit-jupiter-engine \
mvn-org.junit.jupiter-junit-jupiter-params"

inherit rpm
