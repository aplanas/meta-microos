SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgoldrunner-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cc6dcb7b304df81bb30890b562bbc3fb56e273e84a40be6b457c3ef8313a5637edd8457a260092ba39e36c13803a4866b8f40d7534acf366e46c8e36e1c9bef9"

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
