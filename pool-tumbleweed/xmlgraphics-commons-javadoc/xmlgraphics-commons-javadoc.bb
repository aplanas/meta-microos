SUMMARY = "Javadoc for xmlgraphics-commons"
DESCRIPTION = "Javadoc for package xmlgraphics-commons."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-commons-javadoc-2.8-1.2.noarch.rpm"
RPM_HASH = "94cedee20b561162575d1b1a88a760b8d8f0e1f74f54542b4239d4ec46368c7d76431002b0d1a6a6c850566d4f117ea991fb6838bee3bca3b5ce29425c7ec212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlgraphics-commons-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
