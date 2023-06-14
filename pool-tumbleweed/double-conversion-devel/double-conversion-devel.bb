SUMMARY = "Development files for BCD/DCB routines for IEEE doubles"
DESCRIPTION = "Double-conversion provides binary-decimal and decimal-binary routines \
for IEEE double-precision floating point numbers. The library \
consists of conversion routines that have been extracted from the V8 \
JavaScript engine. \
 \
This package provides libraries and header files for developing applications \
that use double-conversion."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "double-conversion-devel-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "24f1a0d13834c0ca247fc69a689e13edc1780d1087fa75b3f9688487980561c3d6b5d2e45051a186bb0d529c45af1a60f7a63be5aac5b07f117c11b6b86a64e2"

RPROVIDES:${PN} += "cmake-double-conversion \
double-conversion-devel"

RDEPENDS:${PN} += "libdouble-conversion3"

inherit rpm
