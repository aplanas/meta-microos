SUMMARY = "Development files for BCD/DCB routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine. \
 \
This package provides libraries and header files for developing applications \
that use double-conversion."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "double-conversion-devel-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "3480d611dd8b74e9e558de3243661a5a5b273cfbe37aa81c57719da3c4b2cd282b8437093596d441006efff38ff945300841039e33cf07670bd782ee1e422b6c"

RPROVIDES:${PN} += "cmake-double-conversion \
double-conversion-devel"

RDEPENDS:${PN} += "libdouble-conversion3"

inherit rpm
