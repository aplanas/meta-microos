SUMMARY = "Qt5 IM module for Fcitx5"
DESCRIPTION = "Qt5 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt5-5.0.17-1.4.aarch64.rpm"
RPM_HASH = "fc0348da931e5b46733519b7d9220cc5456dabc3d24ea51fe39b9ddd0f971fa5627900ede3852af23f0d39d0fc0c68f7cd80a4de4e622ace8b4b319bad0510a7"

RPROVIDES:${PN} += "fcitx-qt5 \
fcitx5-qt5 \
libfcitx-quickphrase-editor5.so \
libfcitx5platforminputcontextplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
