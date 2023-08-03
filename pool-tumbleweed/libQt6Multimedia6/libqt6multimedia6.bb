SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Multimedia6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d4a7a1dab403dd98ee125618b468f3cc68bbad89259304872c52c873cc24ee2800836b8a3754a815f4c59b04ca3b5ddec3bf631bec0bf1a593963d838582043c"

RPROVIDES:${PN} += "libQt6Multimedia.so.6 \
libQt6Multimedia6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
