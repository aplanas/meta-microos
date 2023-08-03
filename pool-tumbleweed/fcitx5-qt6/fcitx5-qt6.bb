SUMMARY = "Qt6 IM module for Fcitx5"
DESCRIPTION = "Qt6 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt6-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "b4bfa41894f85fcbc7cc97cfbb511fbe8310bab4a497333c07729cb34a622314f1cbfb80f71f840eb24ab6ffc3e3af8c4810d47b693a3aa68394a45b54a5ec77"

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
