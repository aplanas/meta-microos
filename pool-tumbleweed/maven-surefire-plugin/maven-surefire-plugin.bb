SUMMARY = "Surefire plugin for maven"
DESCRIPTION = "Maven surefire plugin for running tests via the surefire framework."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-plugin-2.22.0-8.1.noarch.rpm"
RPM_HASH = "f632ba71722e1ae10bc56bf6e1f108292558e4da25d86df28edf2ce5b357a655357e8a6bfb1e1533569cdf88a1e1d24a6d3a320f912c1327c21f89879d346a3d"
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
