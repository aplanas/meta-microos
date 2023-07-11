SUMMARY = "Development files for CSXCAD"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package contains libraries and header files for developing \
applications that use CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "CSXCAD-devel-0.6.2-3.20.aarch64.rpm"
RPM_HASH = "7369ebc329c2cd23c5a4fa7a5095e3630f0091e89edd07c52a0dcd642e1ece6c240dd912d2949072af195ce00af18749e8ec5b1e20a3a12f8b7ea5a3b1eb1e03"

RPROVIDES:${PN} += "CSXCAD-devel"

RDEPENDS:${PN} += "libCSXCAD0"

inherit rpm
