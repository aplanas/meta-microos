SUMMARY = "Qt6 Pdf library"
DESCRIPTION = "The Qt6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Pdf6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f60234d49ec9b84e829826c85ae188478c0956974ba017c6cdc1b39d82e9d2c18917aee1ff49e9adde98687fbe44aa03636757e11366ae53c559ed7d5fbff46a"

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
