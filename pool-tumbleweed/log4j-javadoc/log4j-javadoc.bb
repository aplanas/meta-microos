SUMMARY = "API documentation for log4j"
DESCRIPTION = "API documentation for log4j."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-javadoc-2.17.2-5.7.noarch.rpm"
RPM_HASH = "eb9e66cd7a989c7ddf6a09367df8e83c5f50305e8e167e734dcdfd01ea94f6d10548dd6e665da0f11d3732d7378bdabbdc4a23268b80b823e8662930f2af951e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
