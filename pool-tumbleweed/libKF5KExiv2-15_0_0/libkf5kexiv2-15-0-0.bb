SUMMARY = "Library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5KExiv2-15_0_0-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4fb3a7301887b48e88145861cbc57096dc2aabcb1faa524bb23389ac63e208289723184397873adebdb0150c318187b2b64f41994858919da0e8a70e3db72ac7"

RPROVIDES:${PN} += "libKF5KExiv2-15-0-0 \
libKF5KExiv2.so.15.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
