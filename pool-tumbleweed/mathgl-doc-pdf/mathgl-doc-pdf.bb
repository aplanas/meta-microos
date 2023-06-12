SUMMARY = "Documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides the documentation for MathGL in PDF format."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-pdf-8.0.1-3.3.noarch.rpm"
RPM_HASH = "9fbe0ff786fd62d8eaa5d514d0c9c03b2253b4470f8f4806d1195bf836e6eb643dc247170626bf53311ba06508ab41b51c13d32596e5eb02ea206838497613a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-doc-pdf"
RDEPENDS:${PN} += ""

inherit rpm
