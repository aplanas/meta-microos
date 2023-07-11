SUMMARY = "Javadocs for xerces-j2"
DESCRIPTION = "This package contains the API documentation for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-javadoc-2.12.2-2.7.noarch.rpm"
RPM_HASH = "310791959bceb89e19fabd74936a36ede76d4a1919847bdcba95b74163c6e4c3a21c940a36e54cabfb19f788c7e5190bb9d2bfb4db900d922b43b174cb37651c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
