SUMMARY = "Static libraries for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains static libraries for developing applications \
that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-devel-static-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "1337e5c5384710ba3f43e2cf2c8bced0e9cc186c01a6622739fa767ef85b21c6ca6485b3d242af2ce03f3db93978d398dd570a6a88d7b38ec50c8e88b8d66725"

RPROVIDES:${PN} += "mathgl-devel-static \
mathgl-devel-static(aarch-64)"
RDEPENDS:${PN} += "mathgl-devel"

inherit rpm
