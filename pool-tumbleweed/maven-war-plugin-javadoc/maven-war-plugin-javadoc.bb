SUMMARY = "Javadoc for maven-war-plugin"
DESCRIPTION = "API documentation for maven-war-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-war-plugin-javadoc-3.2.2-3.11.noarch.rpm"
RPM_HASH = "f423d4ca3f57214a610fb6b75b7c02ae15f67e1e1ffa07fe45df316ef898ba57d168a1c5c7f90b22fe769dac05e0aa04a4445301ea03bb3d2b219b5062add48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-war-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
