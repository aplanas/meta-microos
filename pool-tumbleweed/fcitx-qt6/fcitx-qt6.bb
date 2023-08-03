SUMMARY = "Qt6 IM module for Fcitx"
DESCRIPTION = "Qt6 IM module for Fcitx."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt6-1.2.7-1.27.aarch64.rpm"
RPM_HASH = "95a767782cfa9d0932fbeb99a097f6dfcc1bf394097023bac5d2d2b8f0b79763fc889fe94a1223a3dabfb3bb3f29f22aa1bc735e52e209174955601452dcb6fa"

RPROVIDES:${PN} += "fcitx-qt6 \
libfcitxplatforminputcontextplugin-qt6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
