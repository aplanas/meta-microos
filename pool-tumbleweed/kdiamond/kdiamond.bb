SUMMARY = "Single player puzzle game"
DESCRIPTION = "The objective of the game is to build lines of three similar diamonds."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdiamond-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1b6364f4d8330a0b8b2150695d77960cf86f9ab9d60705f649fd8b9bdbc5e95f52aeb622f746e6b6edbb806922f84fe9ffc1ae3795834dc18b882bac6ddd3cad"

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
