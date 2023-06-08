SUMMARY = "Simon Says Game"
DESCRIPTION = "A memory enhancement game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "blinken-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "538bc9df28dfcb3a673504d75bfdb337757ca78cfb93e061055cebba05df995b9b744bb96fe6aa42628dcd2138b6be5a0c3df3beb225cf751ebe5254dfb118a4"

RPROVIDES:${PN} += "application() application(org.kde.blinken.desktop) blinken blinken(aarch-64) blinken5 metainfo() metainfo(org.kde.blinken.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
