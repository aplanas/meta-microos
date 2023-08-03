SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Pdf6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "88c6264c861cf1529f9e4e71dd41410b944a3e797fb055c63b737e88f034b588268772fac51730507dfa886880e3b9f02d2475701d6e116fd56bf26f5bced816"

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
