SUMMARY = "Java Units of Measurement Common Library"
DESCRIPTION = "Units of Measurement Common Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-common-1.2-1.18.noarch.rpm"
RPM_HASH = "f425553e679e33ad8bf7312f74f6b2124126a39296c726975c36b008361f13a713d2df477f9bc6c137e9ff27682dc4fce6530310531b7e388aaced96e61a08e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(tech.uom.lib:uom-lib-common) \
mvn(tech.uom.lib:uom-lib-common:pom:) \
osgi(tech.uom.lib.uom-lib-common) \
uom-lib-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(javax.measure:unit-api)"

inherit rpm
