SUMMARY = "Qt GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudqt2-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "ec24869a0b6514f812def43b067be14ecbc6fbb2a588b7a2cdd905213ae515b5e39f801c1f7a05648c82ec8151e417806509c3abc5966d2581ba53c0de3b01de"

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
