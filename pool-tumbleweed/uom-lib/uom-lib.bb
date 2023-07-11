SUMMARY = "Java Unit of Measurement Libraries (JSR 363)"
DESCRIPTION = "Units of Measurement Libraries - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-1.2-1.19.noarch.rpm"
RPM_HASH = "ff53c1460d5d904a7d47f5ac74cd2f396fa61a384ccfc5aa2145b99e9e8aa87785761f61eebdd124df0c00ea7906fe798cef7db5b73234b3849c55d48c438183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-pom- \
uom-lib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-tech.uom-uom-parent-pom-"

inherit rpm
