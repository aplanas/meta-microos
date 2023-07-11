SUMMARY = "Plexus Languages"
DESCRIPTION = "Plexus Languages is a set of Plexus components that maintain shared \
language features."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "plexus-languages-1.1.1-2.7.noarch.rpm"
RPM_HASH = "4a9781a6aacff32dbcdd0ab34a0ca40b5fe3c998034b6bd6bdd5805fe2965d3442ab57d1890e83e9de1b240f9c7cf13c101fb2095a17a6c2a041ed1ab38678e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-java-pom- \
mvn-org.codehaus.plexus-plexus-languages-pom- \
plexus-languages"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.ow2.asm-asm"

inherit rpm
