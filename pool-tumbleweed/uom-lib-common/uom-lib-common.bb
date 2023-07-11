SUMMARY = "Java Units of Measurement Common Library"
DESCRIPTION = "Units of Measurement Common Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-common-1.2-1.19.noarch.rpm"
RPM_HASH = "0388e2fa1d7093ecbfca6f6143c847482d382a744099d633d81161b7017c7629cb15a08a4e2f8e051ae578df6336bd7bb6a3bff68e7012d9e9ea7a3a220f0219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-common \
mvn-tech.uom.lib-uom-lib-common-pom- \
osgi-tech.uom.lib.uom-lib-common \
uom-lib-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api"

inherit rpm
