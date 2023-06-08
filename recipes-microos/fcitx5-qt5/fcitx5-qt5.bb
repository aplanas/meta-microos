SUMMARY = "Qt5 IM module for Fcitx5"
DESCRIPTION = "Qt5 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-qt5-5.0.16-1.7.aarch64.rpm"
RPM_HASH = "329c955d0b6467d9a14687d0df2c9cee520a6bdc2c61d8386e9684f634217b1b8b388bc5d1f3d99fa44288bc1f07070d4b65f10dfb47d1101ad5dceb040a863d"

RPROVIDES:${PN} += "application() application(org.fcitx.fcitx5-qt5-gui-wrapper.desktop) fcitx-qt5 fcitx5-qt5 fcitx5-qt5(aarch-64) libfcitx-quickphrase-editor5.so()(64bit) libfcitx5platforminputcontextplugin.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Qt5DBusAddons.so.1()(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxcb.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
