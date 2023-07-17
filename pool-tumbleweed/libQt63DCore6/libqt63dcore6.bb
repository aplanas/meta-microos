SUMMARY = "Qt 6 3DCore library"
DESCRIPTION = "The Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DCore6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "84c0f874490d365c45b1689ac0cdcd8b8f53e5305a7af26fa008b54955883383b0593e82a5189ae90dc5c11c2588abd791b4c2340a7cfa48253da722e7a37868"

RPROVIDES:${PN} += "libQt63DCore.so.6 \
libQt63DCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
