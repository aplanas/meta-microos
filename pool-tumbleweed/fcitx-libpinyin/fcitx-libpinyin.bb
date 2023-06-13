SUMMARY = "Libpinyin Wrapper for Fcitx"
DESCRIPTION = "Fcitx-libpinyin is a Frontend of the Intelligent Pinyin IME Backend."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "fcitx-libpinyin-0.5.4-2.9.aarch64.rpm"
RPM_HASH = "3e7c634d1529293bf184eb1612491d90fa3ee518215c0f205fb7791cd7872905bf591a1f185331c4fa5fb153cac8f7f22bae4b01c2ae23e9f41279ca12942c63"

RPROVIDES:${PN} += "fcitx-libpinyin \
fcitx-libpinyin(aarch-64) \
libfcitx-libpinyin-dictmanager.so()(64bit) \
locale(fcitx:zh_CN;zh_SG)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitxQt5DBusAddons.so.1()(64bit) \
libFcitxQt5WidgetsAddons.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libpinyin.so.15()(64bit) \
libpinyin.so.15(LIBPINYIN)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
