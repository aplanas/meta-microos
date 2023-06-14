SUMMARY = "Libpinyin Wrapper for Fcitx"
DESCRIPTION = "Fcitx-libpinyin is a Frontend of the Intelligent Pinyin IME Backend."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "fcitx-libpinyin-0.5.4-2.9.aarch64.rpm"
RPM_HASH = "3e7c634d1529293bf184eb1612491d90fa3ee518215c0f205fb7791cd7872905bf591a1f185331c4fa5fb153cac8f7f22bae4b01c2ae23e9f41279ca12942c63"

RPROVIDES:${PN} += "fcitx-libpinyin \
libfcitx-libpinyin-dictmanager.so \
locale-fcitx-zh-CN;zh-SG"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
ld-linux-aarch64.so.1 \
libFcitxQt5DBusAddons.so.1 \
libFcitxQt5WidgetsAddons.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbus-1.so.3 \
libfcitx-config.so.4 \
libfcitx-utils.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libpinyin.so.15 \
libstdc++.so.6"

inherit rpm
