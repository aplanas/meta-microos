SUMMARY = "Javadocs for jemmy"
DESCRIPTION = "This package contains the API documentation for jemmy."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-javadoc-2.3.0.0-26.7.noarch.rpm"
RPM_HASH = "7e964d2636efa7bf3b5f1257024cf80800d17898a16d96630ee61ef52d4fdc52d744bb2be3fb220323ec38df7a27a59ff98a328b01fca84bbb2a680d12ae1412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
javapackages-tools \
jemmy"

inherit rpm
