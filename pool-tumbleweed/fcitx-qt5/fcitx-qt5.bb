SUMMARY = "Fcitx QT5 Input Context"
DESCRIPTION = "A QT5 input context plugin of Fcitx IM Framework."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-1.2.7-1.26.aarch64.rpm"
RPM_HASH = "2e28215c576ed06a0fa8d9bcbff05a9873f9d5da0518e0b91250ab5e6b4638c2c78a5c8459bc41be8694e1de6c2b51b1d84faeaa931b6f279934ec4ddbd5dbed"

RPROVIDES:${PN} += "fcitx-qt5 \
libFcitxQt5DBusAddons.so.1 \
libFcitxQt5WidgetsAddons.so.1 \
libfcitx-quickphrase-editor5.so \
libfcitxplatforminputcontextplugin.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
