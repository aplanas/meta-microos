SUMMARY = "Fcitx QT5 Input Context"
DESCRIPTION = "A QT5 input context plugin of Fcitx IM Framework."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-1.2.7-1.25.aarch64.rpm"
RPM_HASH = "38632c86f7f586ba091701bb1327b092ca468bd460bdc9124cfbf8cc4b6a932149f1757086fc716789daa3e5aff8a29e6b12577f96af24f9dc0dbcee01b43627"

RPROVIDES:${PN} += "fcitx-qt5 fcitx-qt5(aarch-64) libFcitxQt5DBusAddons.so.1()(64bit) libFcitxQt5WidgetsAddons.so.1()(64bit) libfcitx-quickphrase-editor5.so()(64bit) libfcitxplatforminputcontextplugin.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfcitx-config.so.4()(64bit) libfcitx-utils.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
