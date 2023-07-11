SUMMARY = "Maven Archetype Descriptor model"
DESCRIPTION = "Maven Archetype Descriptor model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-descriptor-3.2.1-1.10.noarch.rpm"
RPM_HASH = "f59c75f1f7508bf49854aba0fb7875f527dc22687a8428977a2722d115b2fb9a99fc5603ba6364cbd14fb04389422b93bb5a2313bf0aa4efc0ddfd75f07b42dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor-pom- \
osgi-org.apache.maven.archetype.descriptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
