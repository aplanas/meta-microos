SUMMARY = "Development files for Calcium, an exact number computation library"
DESCRIPTION = "A C library for exact computation with real and complex numbers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Calcium."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.1"

RPM_NAME = "calcium-devel-0.4.1-1.9.aarch64.rpm"
RPM_HASH = "74b2b0fdfcc1f9707bfac378e146892c4c995fc7742c2bb3d94a26085d50568c978cd624ba3ddb4ac9929722b68333d20eebf7516c38f24a36fc09f5a9d0b3f2"

RPROVIDES:${PN} += "calcium-devel"

RDEPENDS:${PN} += "libcalcium0"

inherit rpm
