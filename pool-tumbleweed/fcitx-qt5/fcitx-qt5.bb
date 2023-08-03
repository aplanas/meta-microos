SUMMARY = "Fcitx QT5 Input Context"
DESCRIPTION = "A QT5 input context plugin of Fcitx IM Framework."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-1.2.7-1.27.aarch64.rpm"
RPM_HASH = "380a025176cc1def6445b067f756be2417cb9672a9070eaf5738ca09a38060d3135ac9d6526e1dcba0fabcef8c77ad90dbf8ac81bf474f9632035ed78dc519a0"

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
