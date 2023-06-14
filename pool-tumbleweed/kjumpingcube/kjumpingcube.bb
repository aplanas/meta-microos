SUMMARY = "Tactical board game"
DESCRIPTION = "KJumpingCube is a tactical one or two-player game. The playing field \
consists of squares that contains points which can be increased. By \
this you can gain more fields and finally win the board over."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kjumpingcube-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a6812056086f3f1f64c08cd536f2da66a52bedd7b8b152c06459e9e7b37f8f6129471eb5fdbc118a268190689e12daf5568606be2e39d7bf840eec176ec22a24"

RPROVIDES:${PN} += "kjumpingcube \
kjumpingcube5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
