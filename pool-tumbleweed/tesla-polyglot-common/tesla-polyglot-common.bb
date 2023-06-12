SUMMARY = "Polyglot Tesla :: Common"
DESCRIPTION = "Polyglot Tesla :: Common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-0.4.5-1.3.noarch.rpm"
RPM_HASH = "7648147aaf14704f0c0938b2a728863067fec6007e35aa980c2740a02db1406806e2e3fd679588d9e538a21ceb3c1271c04e193dabb4df1932d59a67fec91361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.takari.polyglot:polyglot-common) \
mvn(io.takari.polyglot:polyglot-common:pom:) \
mvn(io.takari.polyglot:polyglot:pom:) \
mvn(io.tesla.polyglot:tesla-polyglot-common) \
mvn(io.tesla.polyglot:tesla-polyglot-common:pom:) \
mvn(org.sonatype.pmaven:pmaven-common) \
mvn(org.sonatype.pmaven:pmaven-common:pom:) \
tesla-polyglot-common"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
