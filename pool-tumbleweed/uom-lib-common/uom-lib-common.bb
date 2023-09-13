SUMMARY = "Java Units of Measurement Common Library"
DESCRIPTION = "Units of Measurement Common Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-common-1.2-2.1.noarch.rpm"
RPM_HASH = "42478a99c3451e76056b252028de38f36d85d4d5899bf104b0c0822ed52a01e9b6acccf09bb286263ec6c4381fff56938b19ffe4d638149f87711ef3c489e6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-common \
mvn-tech.uom.lib-uom-lib-common-pom- \
osgi-tech.uom.lib.uom-lib-common \
uom-lib-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api"

inherit rpm
