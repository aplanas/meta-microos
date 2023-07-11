SUMMARY = "Qt GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudqt2-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "d15a8eddae4559f230cf6f4ba977bca36ea9c8babf6c1f8f7b61e616f63715427d4aba94acf39d8f4fbe3370bab4ce511255679ea15b2023a7729f1db9ea61a4"

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
