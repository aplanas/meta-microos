SUMMARY = "Maven Archetype packaging configuration for archetypes"
DESCRIPTION = "Maven Archetype packaging configuration for archetypes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-packaging-3.2.1-2.1.noarch.rpm"
RPM_HASH = "8cfeda934beb69a619615285f636da86c4e247949fb882236b85e05237cf1903d791f9247bc5f655e80a6329601aa0b16dc9fd4faac8813120ac0d4d01acd6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
