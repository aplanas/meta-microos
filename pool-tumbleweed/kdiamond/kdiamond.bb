SUMMARY = "Single player puzzle game"
DESCRIPTION = "The objective of the game is to build lines of three similar diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdiamond-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "751428293abe0f7656733ff33f89a300949aaca3a509b697568c411034f70af3c4493aa9d5a863aca32ffe1548b13fc3b547e5d806609140ca8f1d72a50c15e1"

RPROVIDES:${PN} += "kdiamond \
kdiamond5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
