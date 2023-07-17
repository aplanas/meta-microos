SUMMARY = "Development files for the Open AuTHentication (OATH) HOTP support library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains the header files for the HOTP/TOTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.8"

RPM_NAME = "liboath-devel-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "977713e9827cdbdd60b99ceb57f08639ac7a7d9ee9cf5fb7fd345c4dd8badfd4eef60d200fdf83db9da3858ddbaa1eba5e7e2c2318178a48a48126cdc6f8a2b8"

RPROVIDES:${PN} += "liboath-devel \
pkgconfig-liboath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboath0"

inherit rpm
