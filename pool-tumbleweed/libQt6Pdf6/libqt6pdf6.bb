SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Pdf6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "1dc0a6d32532b8e216dece7f3efee16442b0f89ffbde666809b2fc22b81466c36860e13d1a881726ed9219e238c93ddf9d9ca3c1f3817ca2a5420dfa1beaff72"

RPROVIDES:${PN} += "libQt6Pdf.so.6 \
libQt6Pdf6 \
libqpdf.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
