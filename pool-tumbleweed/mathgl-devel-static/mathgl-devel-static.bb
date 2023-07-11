SUMMARY = "Static libraries for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains static libraries for developing applications \
that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-devel-static-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "1de50ce9c66c069bf962ee6d9ab4c71907d3c2b3455f003ced68606ab25a9cfb8dd22c887f9048c54d3f83689f577014f7e18809aff366372cda21d8969923c4"

RPROVIDES:${PN} += "mathgl-devel-static"

RDEPENDS:${PN} += "mathgl-devel"

inherit rpm
