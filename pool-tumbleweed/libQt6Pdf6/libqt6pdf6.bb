SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Pdf6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "c4411ce2a992dab8d2d1615808e05b7a49e068e5341f7ba3fe479b7cdb10122e31c2eb90deed286d5094d9f4b3f8c5b738a25f13ab9fe5c0136b1eb790d66983"

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
libstdc++.so.6"

inherit rpm
