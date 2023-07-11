SUMMARY = "Units of Measurement Project Parent POM"
DESCRIPTION = "Main parent POM for all Units of Measurement Maven projects."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "uom-parent-1.3-1.19.noarch.rpm"
RPM_HASH = "7e6f14be3245972391fbd5c2e23ada786eda05778f27547994be31a2648d2abf84df7b1afcd8dbef4e12fd20db2df98a8189ef0dd392a70a805a4ab08084f8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom-uom-parent-pom- \
uom-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
