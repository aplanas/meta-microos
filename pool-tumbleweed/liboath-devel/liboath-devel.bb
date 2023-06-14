SUMMARY = "Development files for the Open AuTHentication (OATH) HOTP support library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
This subpackage contains the header files for the HOTP/TOTP library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "liboath-devel-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "65dbdc308825de0be30e22c85e99332f92c2fec4c01bc6563647c317586fea8d5a610603e736c69b8d2d1cef0b2017110d831bffde9d5c27083bb928fb80eb35"

RPROVIDES:${PN} += "liboath-devel \
pkgconfig-liboath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboath0"

inherit rpm
