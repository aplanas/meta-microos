SUMMARY = "Qt GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "libaudqt2-4.3-1.3.aarch64.rpm"
RPM_HASH = "24cfe03c3f8d589616c312d8c983a586039f133aad8a9a5603cbd4b0b49c66fb36e70e870a713d2d16bdc11777b0f17cbe156f2caf2a6399f1afaad336137c5c"

RPROVIDES:${PN} += "libaudqt.so.2 \
libaudqt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libaudcore.so.5 \
libaudcore5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
