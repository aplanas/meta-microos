SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "blinken-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "59ce523756d83798227058d7d1699f02e62afb1bec3c40b82247667f4688cac034897f8eae1f8f3600602d4d722f68a05a5f48a548c6fbf93ea826e823dbfde3"

RPROVIDES:${PN} += "application() application(org.kde.blinken.desktop) blinken blinken(aarch-64) blinken5 metainfo() metainfo(org.kde.blinken.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
