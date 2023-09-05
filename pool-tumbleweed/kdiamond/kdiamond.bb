SUMMARY = "Single player puzzle game"
DESCRIPTION = "The objective of the game is to build lines of three similar diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdiamond-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4341c14232bef9b5fee4c023a493b30741857565cb90a5b34a796710976d8ca42f9826c8cb9f97bfae193cc658bf1140ee45bf6c94beca54c74655ad1a9abbc2"

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
