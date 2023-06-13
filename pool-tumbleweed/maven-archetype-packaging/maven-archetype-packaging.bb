SUMMARY = "Maven Archetype packaging configuration for archetypes"
DESCRIPTION = "Maven Archetype packaging configuration for archetypes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-packaging-3.2.1-1.9.noarch.rpm"
RPM_HASH = "a47dc5cd53a26ef30fa788bdf2e4622ff74085e893d5a372cab80d4f9e5242c913ac3881cfad39e987498ee8cdb672d6d5b154bb0d94a4660069ea337d745e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-packaging \
mvn(org.apache.maven.archetype:archetype-packaging) \
mvn(org.apache.maven.archetype:archetype-packaging:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
