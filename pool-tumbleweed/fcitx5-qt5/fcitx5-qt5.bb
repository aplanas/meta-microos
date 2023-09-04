SUMMARY = "Qt5 IM module for Fcitx5"
DESCRIPTION = "Qt5 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-qt5-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "2955b04045ad5dfdc83e711eb97af4b765e3f33162d2519c9ecaa0db767308ec80702ed7337eebada56b1a22e0ba729f965b8536f22f7f649501a62e036afff5"

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
