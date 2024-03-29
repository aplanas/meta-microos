SUMMARY = "Qt6 IM module for Fcitx5"
DESCRIPTION = "Qt6 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-qt6-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "1186151185f3f8f099ec8820244df2faf6ad570834d1bd3361665596f55c56b463d8df9de16eb712806c19e8e671c5272e99a32c6c83c8947d76217ce0b08dd9"

RPROVIDES:${PN} += "fcitx-qt6 \
fcitx5-qt6 \
libfcitx5platforminputcontextplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt6DBusAddons.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
