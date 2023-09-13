SUMMARY = "Java Unit of Measurement Libraries (JSR 363)"
DESCRIPTION = "Units of Measurement Libraries - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-1.2-2.1.noarch.rpm"
RPM_HASH = "44d3df154abf450c8ac790154ecf15b38979f3c1ce7c96ea42bc0bbb2670d2057a75495e1162a1e2568e441ef192e1ec3e8be5d4da2e96453848326cef54f3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-pom- \
uom-lib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-tech.uom-uom-parent-pom-"

inherit rpm
