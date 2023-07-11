SUMMARY = "Development files for libhmac"
DESCRIPTION = "Development files for libhmac, a library to support various Hash-based Message Authentication Codes (HMAC). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhmac."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac-devel-20230407-1.2.aarch64.rpm"
RPM_HASH = "41e8823301f9cc5ce5f228b748d6754eb534931a8d31ccb64aa28565385c6d4eb4bad1b0769f9bdb603b37db51b46f6b6f2253cab5a8aa1112e9bc88bca047ba"

RPROVIDES:${PN} += "libhmac-devel \
pkgconfig-libhmac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhmac1"

inherit rpm
