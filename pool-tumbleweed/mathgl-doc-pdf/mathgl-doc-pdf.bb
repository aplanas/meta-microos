SUMMARY = "Documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides the documentation for MathGL in PDF format."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-pdf-8.0.1-4.2.noarch.rpm"
RPM_HASH = "9784dcc476c675a1b903a0dc998434441e1e232cf844a4870087c00c22a09a934c37222785bff3478019fa7c4e3a3aabecf36f7c824dd815a3b15022cf44e16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
