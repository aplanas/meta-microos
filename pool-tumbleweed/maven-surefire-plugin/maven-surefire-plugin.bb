SUMMARY = "Surefire plugin for maven"
DESCRIPTION = "Maven surefire plugin for running tests via the surefire framework."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-plugin-2.22.0-8.2.noarch.rpm"
RPM_HASH = "149f98d13750770afc009295bbdc9ad357b49706c8082d3a6d579ecf22157833f0cce2532400c2551564d84a0b7b88cb988436d3a51be19a8c3a58374b59839e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.surefire-maven-surefire-common"

inherit rpm
