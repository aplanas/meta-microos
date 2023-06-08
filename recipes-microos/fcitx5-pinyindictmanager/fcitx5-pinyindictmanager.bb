SUMMARY = "Fcitx5 Pinyin dictionary manager library"
DESCRIPTION = "Fcitx5 Pinyin dictionary manager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-pinyindictmanager-5.0.16-1.5.aarch64.rpm"
RPM_HASH = "9ca19ddd27d55aae53823359ecd366ad8938d15dc2f7a7ce046c0a948b61446897abed2e0fa25d7133476cbd1717d4f96be6ea1abd99c835d7324a6716c06623"

RPROVIDES:${PN} += "fcitx5-pinyindictmanager fcitx5-pinyindictmanager(aarch-64) libpinyindictmanager.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
