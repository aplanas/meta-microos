SUMMARY = "Jetty version management Maven plugin"
DESCRIPTION = "Jetty version management Maven plugin"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-1.0.10-2.9.noarch.rpm"
RPM_HASH = "debbc82eb2352aaee5e828db7309d64575b2e026a7d2c5d47514f388f3a1c255bcaaf8c59c05be054e8a8b20c769adab6a81984295aec396a18baf3471d32f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-project"

inherit rpm
