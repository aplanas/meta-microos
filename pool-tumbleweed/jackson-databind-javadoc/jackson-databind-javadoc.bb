SUMMARY = "Javadoc for jackson-databind"
DESCRIPTION = "This package contains API documentation for jackson-databind."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.13.4.2"

RPM_NAME = "jackson-databind-javadoc-2.13.4.2-1.3.noarch.rpm"
RPM_HASH = "42e23c5eefa70425c459dd78539cacea28360167fde045665ea03cac26359aeaee71a23308fe352413906d4c0f9fa000641d535647a2eb2116a152161b6e2094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
