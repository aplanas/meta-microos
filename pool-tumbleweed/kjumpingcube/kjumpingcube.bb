SUMMARY = "Tactical board game"
DESCRIPTION = "KJumpingCube is a tactical one or two-player game. The playing field \
consists of squares that contains points which can be increased. By \
this you can gain more fields and finally win the board over."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kjumpingcube-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a6812056086f3f1f64c08cd536f2da66a52bedd7b8b152c06459e9e7b37f8f6129471eb5fdbc118a268190689e12daf5568606be2e39d7bf840eec176ec22a24"

RPROVIDES:${PN} += "application() \
application(org.kde.kjumpingcube.desktop) \
kjumpingcube \
kjumpingcube(aarch-64) \
kjumpingcube5 \
metainfo() \
metainfo(org.kde.kjumpingcube.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
