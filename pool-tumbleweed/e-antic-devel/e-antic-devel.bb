SUMMARY = "Development files for e-antic"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC. \
 \
This subpackage contains the include files and library links for \
developing against the ANTIC library."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "e-antic-devel-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "6d89d4961b3be1cd89895a3d9d60b600901dd6e5c0daa6f78a60a96eb5e934df97f83e9e5dd4e60a1a152e6e79b6160d934bb566b359264496a7d7b0e59006ab"

RPROVIDES:${PN} += "e-antic-devel"

RDEPENDS:${PN} += "antic-devel \
arb-devel \
libboost-headers-devel \
libeantic1"

inherit rpm
