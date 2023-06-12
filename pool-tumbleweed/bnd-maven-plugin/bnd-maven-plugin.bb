SUMMARY = "BND Maven plugin"
DESCRIPTION = "Collection of various Maven plugins provided by the Bnd project."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "bnd-maven-plugin-5.2.0-3.1.noarch.rpm"
RPM_HASH = "7c660e205c8e404d1563568b54cbd2d6c5ca2439bf546b2324669141f2ea1602a25cfdcb585d02f4884bda84d51da5cb50a500f449bfde689b93dc9645b97612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin \
mvn(biz.aQute.bnd:bnd-maven-plugin) \
mvn(biz.aQute.bnd:bnd-maven-plugin:pom:) \
mvn(biz.aQute.bnd:bnd-plugin-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(biz.aQute.bnd:biz.aQute.bndlib) \
mvn(org.apache.maven.shared:maven-mapping) \
mvn(org.slf4j:slf4j-api) \
mvn(org.sonatype.plexus:plexus-build-api)"

inherit rpm
