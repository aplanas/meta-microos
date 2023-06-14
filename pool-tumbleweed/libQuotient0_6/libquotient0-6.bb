SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.6.11"

RPM_NAME = "libQuotient0_6-0.6.11-2.3.aarch64.rpm"
RPM_HASH = "ffdd9ed1810455a817531f531e971a8a0bf4100f3972c3eac0a728c078dcb6a030e8315db69e448dc6e5fbf84ad4ed21d05c1740778a4edc12eb64c64aaf44d4"

RPROVIDES:${PN} += "libQuotient.so.0.6 \
libQuotient0-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
