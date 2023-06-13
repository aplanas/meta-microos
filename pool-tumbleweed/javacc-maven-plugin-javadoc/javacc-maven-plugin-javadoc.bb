SUMMARY = "Javadoc for javacc-maven-plugin"
DESCRIPTION = "API documentation for javacc-maven-plugin."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "javacc-maven-plugin-javadoc-2.6-2.10.noarch.rpm"
RPM_HASH = "500b5c00e84d26811ebf970312bb6456269ecb69d21b4d3c9ea7d67573f3a2a77daea1964e77e5a84ed98d0ac4543337628907bcfeeddc6e472232f18d61187c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
