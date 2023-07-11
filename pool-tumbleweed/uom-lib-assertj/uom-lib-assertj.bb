SUMMARY = "Java Units of Measurement AssertJ Library"
DESCRIPTION = "Units of Measurement AssertJ Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-assertj-1.2-1.19.noarch.rpm"
RPM_HASH = "ef63d4ddf0db566a7623a9d212d43f565c6a87396a174edbe76c0de2bad59126db6392180ac48d8056b074719982acca3118ae3c1a9072a4e1a4d0a727367e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-tech.uom.lib-uom-lib-assertj \
mvn-tech.uom.lib-uom-lib-assertj-pom- \
uom-lib-assertj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.measure-unit-api \
mvn-junit-junit \
mvn-org.assertj-assertj-core"

inherit rpm
