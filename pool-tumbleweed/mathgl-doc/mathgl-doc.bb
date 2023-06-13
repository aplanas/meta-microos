SUMMARY = "Documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides the documentation for MathGL in HTML format."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-8.0.1-3.3.noarch.rpm"
RPM_HASH = "d2037d33b910a296194c5a015f12eda7e5010ddee8444dca6b1e63a9ed0fdd9dea3dea0566bdbef4783a392947075382152ea64f8a97f0150d763c9dfb26ac8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-doc"

RDEPENDS:${PN} += ""

inherit rpm
