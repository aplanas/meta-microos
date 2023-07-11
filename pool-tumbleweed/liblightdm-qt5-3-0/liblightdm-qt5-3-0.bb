SUMMARY = "LightDM Qt5-based Client Library"
DESCRIPTION = "A Qt5-based library for LightDM clients to use to interface with \
LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-qt5-3-0-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "aa96eb3f5f690ae4f2f1f0baa172db11eb1af332012ec77d9c6dcb394969b46e4ad6fa7cfa72d4ad735ab7b2c3b4006e35f721987908a2f05fcfaafed3dab368"

RPROVIDES:${PN} += "liblightdm-qt-3-0 \
liblightdm-qt5-3-0 \
liblightdm-qt5-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
liblightdm-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm
