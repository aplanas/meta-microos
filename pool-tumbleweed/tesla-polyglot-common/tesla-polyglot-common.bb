SUMMARY = "Polyglot Tesla :: Common"
DESCRIPTION = "Polyglot Tesla :: Common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-0.4.5-1.4.noarch.rpm"
RPM_HASH = "58b5ed6daafac57d4f714da69055a877795d90b30901ba222ee72000f34440a564b9a1e20416f541f5cd741d82ae84b81e71fd9cbeec94a526fa4a658cc1c7a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.takari.polyglot-polyglot-common \
mvn-io.takari.polyglot-polyglot-common-pom- \
mvn-io.takari.polyglot-polyglot-pom- \
mvn-io.tesla.polyglot-tesla-polyglot-common \
mvn-io.tesla.polyglot-tesla-polyglot-common-pom- \
mvn-org.sonatype.pmaven-pmaven-common \
mvn-org.sonatype.pmaven-pmaven-common-pom- \
tesla-polyglot-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
