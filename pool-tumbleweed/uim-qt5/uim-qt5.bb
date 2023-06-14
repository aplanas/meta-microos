SUMMARY = "Qt5 input module plugin for uim"
DESCRIPTION = "Contains Qt5 input module plugin for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-qt5-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "3a6a5e1b69dcaabb879789e6770792c358764b1e1efadee4c47dd49807ba6a4f7b2b346981219c8310b20d2ad7ee5100f2e09193710bf30aa1970d384d772abb"

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
