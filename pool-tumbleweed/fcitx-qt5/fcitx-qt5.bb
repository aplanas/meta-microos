SUMMARY = "Fcitx QT5 Input Context"
DESCRIPTION = "A QT5 input context plugin of Fcitx IM Framework."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-1.2.7-1.25.aarch64.rpm"
RPM_HASH = "38632c86f7f586ba091701bb1327b092ca468bd460bdc9124cfbf8cc4b6a932149f1757086fc716789daa3e5aff8a29e6b12577f96af24f9dc0dbcee01b43627"

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
