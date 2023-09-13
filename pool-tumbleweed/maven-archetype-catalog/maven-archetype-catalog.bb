SUMMARY = "Maven Archetype Catalog model"
DESCRIPTION = "Maven Archetype Catalog model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-catalog-3.2.1-2.1.noarch.rpm"
RPM_HASH = "b441dc731ef1b4e46ace0fc4e533d6d31c8b534224d96d51a39621a71ba32ad6bf811bce67d14a98ab4fb8df4b82a01ef2f6142df9d74e3953ac0dd550566830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog-pom- \
osgi-org.apache.maven.archetype.catalog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
