SUMMARY = "Next Generation Units of Measurement Implementation"
DESCRIPTION = "Units of Measurement Libraries - JSR 385 Reference Implementation"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-1.3-4.1.noarch.rpm"
RPM_HASH = "0519810b94de16ab22b1342f0e2543e0c91fd99d817494a7c100056ebd651675044ed28416f8dcf10be933804d886d65aea233c6f0c96ef522a30032318cf4cc"
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
