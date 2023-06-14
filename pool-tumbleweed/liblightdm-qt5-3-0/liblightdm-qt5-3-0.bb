SUMMARY = "LightDM Qt5-based Client Library"
DESCRIPTION = "A Qt5-based library for LightDM clients to use to interface with \
LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-qt5-3-0-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "42bd1af8715593db92c1cc3d100ce2e1ae9fe853e8f38e44d85b9083e196b727cb2d34c16945ff0958f3c4cf9d24006127e4aec4b0b6a92f0e01b633d8ff4194"

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
