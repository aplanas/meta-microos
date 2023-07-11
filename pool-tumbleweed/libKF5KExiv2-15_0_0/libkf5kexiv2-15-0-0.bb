SUMMARY = "Library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5KExiv2-15_0_0-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "46884931c3b3deaef7372590d3423046393b39b002d2222a1ec31a9725ec1ea261d94bc2e6aaaff23c187123a175dbb451879ebceafa33d9353805b3ecc8a361"

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
