SUMMARY = "Maven Archetype Catalog model"
DESCRIPTION = "Maven Archetype Catalog model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-catalog-3.2.1-1.10.noarch.rpm"
RPM_HASH = "d83a46ed84ab2fb1aee8f62800e39a7c5b49d6acf10676f21e0d651b5172c0433fdbb34039517c997d3a791d3ed5af5990895d7590908606297798eb801c6721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog-pom- \
osgi-org.apache.maven.archetype.catalog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
