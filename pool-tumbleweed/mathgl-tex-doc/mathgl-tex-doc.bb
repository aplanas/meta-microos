SUMMARY = "Documentation for mglTeX"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides documentation for mglTeX."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tex-doc-8.0.1-3.3.noarch.rpm"
RPM_HASH = "64491db8cd6cc363c9994a021899f4a51daa209d45f9fabb3a7123035e2269b7f1106f916c1817a74befd7b18be32898d58b6112be71a226cae83af26540d8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc"
RDEPENDS:${PN} += ""

inherit rpm
