SUMMARY = "Qt6 IM module for Fcitx5"
DESCRIPTION = "Qt6 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt6-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "7a68c90b152f3933f135d60bcd3f6c6b8e987d917d339f3236216b06cee4c26aa9c4eedd5005f89e78a5bd44d195ae00d30102e2728bb10ce00c2e2a36aee84f"

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
