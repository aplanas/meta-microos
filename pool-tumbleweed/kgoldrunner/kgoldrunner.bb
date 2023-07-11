SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kgoldrunner-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "98615df3829d782c97b56966159bc26ddc3f4e73c0171b4402f0a42275170fbb8cf16be6d426150c23174827cb5d1d4f64185be7d845b8a8c3c651ca18357d4e"

RPROVIDES:${PN} += "kgoldrunner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
