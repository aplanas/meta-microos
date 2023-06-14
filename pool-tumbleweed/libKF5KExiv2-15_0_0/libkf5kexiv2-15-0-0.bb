SUMMARY = "Library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5KExiv2-15_0_0-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "aa44b2a68f448ebfa654d62cea3b8aea7af3e21a89c91b75e9af8d7de981dd7346b7f60ad7447f16c951c107e0ef2d9da9b39a042b5ae02e51b74411e1f21a4d"

RPROVIDES:${PN} += "libKF5KExiv2-15-0-0 \
libKF5KExiv2.so.15.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
