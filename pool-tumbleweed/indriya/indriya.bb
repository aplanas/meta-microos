SUMMARY = "Next Generation Units of Measurement Implementation"
DESCRIPTION = "Units of Measurement Libraries - JSR 385 Reference Implementation"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-1.3-3.10.noarch.rpm"
RPM_HASH = "e2ee9260d4723ac15456207ddafdf6356ceb00c91410a94169ef834d62be7f27343ea80446d177effc3cecac77b3b59190099d0d3f67d7fbb95a0d928a1ece6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya \
mvn-tech.units-indriya \
mvn-tech.units-indriya-pom- \
osgi-tech.units.indriya"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api \
mvn-tech.uom.lib-uom-lib-common"

inherit rpm
