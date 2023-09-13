SUMMARY = "Java Units of Measurement AssertJ Library"
DESCRIPTION = "Units of Measurement AssertJ Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-assertj-1.2-2.1.noarch.rpm"
RPM_HASH = "74e236ac59ff14388d19f79508d2c9bb1e4f7ed74ea337e9d9b03b80d092621d764912bb23ea2de2358f1ad550a2417f018a21c909facdcda4e8de65fabc2043"
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
