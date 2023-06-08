SUMMARY = "Javadocs for antlr-maven-plugin"
DESCRIPTION = "This package contains the API documentation for antlr-maven-plugin."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "antlr-maven-plugin-javadoc-2.2-3.10.noarch.rpm"
RPM_HASH = "faf22145f9cd713a398168de5726668182db0a43c5146095c7d4aeffe4df32dc33a707b11d5e39b1f6a85ac20519c497a283b48c078530cdf4c5c2c7c8937343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-maven-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
