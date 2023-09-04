SUMMARY = "Javadoc for jackson-databind"
DESCRIPTION = "This package contains API documentation for jackson-databind."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.15.2"

RPM_NAME = "jackson-databind-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "fef807c325c495f111ded18fe0f23a1982878a779eafa402b9d27168427a2d6d4ec31e5109441762a2e78a43093f1a96c204631fefa4ca51315f427275a5f168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
