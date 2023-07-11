SUMMARY = "BND Maven plugin"
DESCRIPTION = "Collection of various Maven plugins provided by the Bnd project."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "bnd-maven-plugin-5.2.0-3.2.noarch.rpm"
RPM_HASH = "8f2d0a4b998c8fdb1455c828f70fc0746b38fb8c027b3841f6b827bc48779de597b4610cff15753dea081dfdbf98b375dbc032a8e9b6862cf1643f2a93ca0e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin \
mvn-biz.aQute.bnd-bnd-maven-plugin \
mvn-biz.aQute.bnd-bnd-maven-plugin-pom- \
mvn-biz.aQute.bnd-bnd-plugin-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-org.apache.maven.shared-maven-mapping \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
