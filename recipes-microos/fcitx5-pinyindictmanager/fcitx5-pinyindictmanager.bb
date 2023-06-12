SUMMARY = "Fcitx5 Pinyin dictionary manager library"
DESCRIPTION = "Fcitx5 Pinyin dictionary manager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-pinyindictmanager-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "0447901f86bde39d1ec0d66c64696dbdb3f601982416a4e1752468415fadf3cb0f92cc83880fcab0260e268e624a2043c1767e2f684d8a1706a461a33aaa62be"

RPROVIDES:${PN} += "fcitx5-pinyindictmanager fcitx5-pinyindictmanager(aarch-64) libpinyindictmanager.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
