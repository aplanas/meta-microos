SUMMARY = "Javadoc for plantuml"
DESCRIPTION = "This package contains the API documentation for plantuml."
LICENSE = "GPL-3.0-or-later"

PV = "1.2023.1"

RPM_NAME = "plantuml-javadoc-1.2023.1-1.4.noarch.rpm"
RPM_HASH = "d2c847b1cc46ffc8cdbae870d800302a51f972b09bdbfc3145fe3eb7ce15e40d20c6976e358dbcb4a2a7c02c81808b661e912082d8dfc7a85d49af2807032904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plantuml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
