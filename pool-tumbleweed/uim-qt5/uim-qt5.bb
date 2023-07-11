SUMMARY = "Qt5 input module plugin for uim"
DESCRIPTION = "Contains Qt5 input module plugin for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-qt5-1.8.8-9.10.aarch64.rpm"
RPM_HASH = "7e8f6e8312ec752afd648674aec13c69e4a3f397e09dbc584eba37f521acb3a639ffb5491c1636ac81fb3125a3fb9431544f38c55fb6b5678a6b81349a0de990"

RPROVIDES:${PN} += "libuimplatforminputcontextplugin.so \
uim-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuim-custom.so.2 \
libuim-scm.so.0 \
libuim.so.8 \
uim"

inherit rpm
