SUMMARY = "Maven shared utility classes"
DESCRIPTION = "This project aims to be a functional replacement for plexus-utils in Maven. \
 \
It is not a 100% API compatible replacement though but a replacement with \
improvements: lots of methods got cleaned up, generics got added and we dropped \
a lot of unused code."
LICENSE = "Apache-2.0"

PV = "3.3.4"

RPM_NAME = "maven-shared-utils-3.3.4-1.1.noarch.rpm"
RPM_HASH = "12abc37a339a55ae2138c3bb30895865bd09fc96d77a0af70fccb6b3b7d071c5b318d2ed525b978d3e2fdca2d3008ce93f848a9fb8d6060d9f4293b2c5a47615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven.shared:maven-shared-utils:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io)"

inherit rpm
