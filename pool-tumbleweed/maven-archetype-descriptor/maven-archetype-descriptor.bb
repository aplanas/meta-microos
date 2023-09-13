SUMMARY = "Maven Archetype Descriptor model"
DESCRIPTION = "Maven Archetype Descriptor model."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-descriptor-3.2.1-2.1.noarch.rpm"
RPM_HASH = "fb2eb4f77efeaa644dfe8d719cc93d6db84d2f47c19ad43d2034da1f0bfbf628f6677623355aba04fdee5a1a61d72942d0036aab6486edf51697514ca9112461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor-pom- \
osgi-org.apache.maven.archetype.descriptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
