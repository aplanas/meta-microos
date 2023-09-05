SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kgoldrunner-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b866d5bb5db2880e76a7b6c3cea5ca269124ea75ed15d2f95de031f031786c5f936340041d78fd3a8d3c3681ef985bd62755e91dde8653772cc2e363a0e0313b"

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
