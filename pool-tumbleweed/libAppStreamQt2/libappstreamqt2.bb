SUMMARY = "Qt5 bindings for AppStream"
DESCRIPTION = "The Qt5 bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libAppStreamQt2-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "417b2cd3f43574f6a26089ac3d2e64216c9e0aba5b0bec35b3d6d0fc90d7bb9c923d9f785ccfc33a6222adc5481d4e962dabf05acb1f8178f0ec6b01cfe13440"

RPROVIDES:${PN} += "libAppStreamQt.so.2 \
libAppStreamQt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libappstream.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
