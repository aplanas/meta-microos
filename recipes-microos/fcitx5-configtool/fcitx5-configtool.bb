SUMMARY = "Configuration tool for fcitx5"
DESCRIPTION = "Configuration tool for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-configtool-5.0.16-1.3.aarch64.rpm"
RPM_HASH = "8d7263edef02e7b80097507bb643a892fcfb53a71c61ad1eb55478ec8af89fbbcc9ade622afb4f740aa62849343bd057671350c221c74fa8ae9fef4cf6f3ec83"

RPROVIDES:${PN} += "application() application(kbd-layout-viewer5.desktop) application(org.fcitx.fcitx5-config-qt.desktop) application(org.fcitx.fcitx5-migrator.desktop) fcitx-config-gtk3 fcitx5-configtool fcitx5-configtool(aarch-64) libFcitx5Migrator.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Qt5DBusAddons.so.1()(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libKF5ItemViews.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxkbfile.so.1()(64bit)"

inherit rpm
