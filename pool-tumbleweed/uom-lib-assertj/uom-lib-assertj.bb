SUMMARY = "Java Units of Measurement AssertJ Library"
DESCRIPTION = "Units of Measurement AssertJ Library - extending and complementing JSR 363."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-assertj-1.2-1.18.noarch.rpm"
RPM_HASH = "10b2dd7b063e9ee7477713268079e10245d1e15f30e750c911da2653b346bac9ec7cb54fd782bd815eb91d9bb76997a2ff4815ef703efca57799e3b9047a380d"
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
