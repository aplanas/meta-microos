SUMMARY = "Maven Archetype packaging configuration for archetypes"
DESCRIPTION = "Maven Archetype packaging configuration for archetypes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-packaging-3.2.1-1.10.noarch.rpm"
RPM_HASH = "c3672dd9a59e5360e85a099bb37b1b4a7ddeb132ee30f4f47a21c7143caaf51eeadeffcd37f675bce2d74905e840fb506c63c1bd5147c490667e7355c69fb5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
