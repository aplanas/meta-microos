SUMMARY = "Development files for e-antic"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC. \
 \
This subpackage contains the include files and library links for \
developing against the ANTIC library."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "e-antic-devel-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "e78dd79803368216c29b174a7efdee3eb0d61c4a61c4cd671304b42282aa7436dfe052623253e31f8e96355f81e2fa851a398d98105296de2464f8cf7f8a5c8f"

RPROVIDES:${PN} += "e-antic-devel"

RDEPENDS:${PN} += "antic-devel \
arb-devel \
libboost-headers-devel \
libeantic1"

inherit rpm
