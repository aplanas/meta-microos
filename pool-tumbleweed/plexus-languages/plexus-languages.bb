SUMMARY = "Plexus Languages"
DESCRIPTION = "Plexus Languages is a set of Plexus components that maintain shared \
language features."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "plexus-languages-1.1.1-2.6.noarch.rpm"
RPM_HASH = "4a0f004542d0e31fd205bbeade0b285ab69255c73f4e0e1eafb2b0a5bb858a24225e2dde863cb21078c9c3b015bc585bb48b094090f9adfa92a0be84ba683fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-java) \
mvn(org.codehaus.plexus:plexus-java:pom:) \
mvn(org.codehaus.plexus:plexus-languages:pom:) \
plexus-languages"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.qdox:qdox) \
mvn(org.ow2.asm:asm)"

inherit rpm
