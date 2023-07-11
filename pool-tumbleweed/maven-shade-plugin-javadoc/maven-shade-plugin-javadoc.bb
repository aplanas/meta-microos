SUMMARY = "API documentation for maven-shade-plugin"
DESCRIPTION = "API documentation for maven-shade-plugin."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-shade-plugin-javadoc-3.4.1-1.2.noarch.rpm"
RPM_HASH = "9bca1bf9565ec8df6743d6209ba3c4be6b1589c8d35e55afb8d7216a319b1006d4dcca9440f7e472afc634987d3691109366b15fe1f0bdae71d68d40aa2932d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
