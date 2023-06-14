SUMMARY = "Traditional Chinese Boardgame by KDE"
DESCRIPTION = "Traditional Chinese Boardgame."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kigo-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8b79766b8970c74df21309a629044d9d61f44e6d38974242dbce40efba189d76d47e5d22301621bf1b8a267b69a9f5afaa960b06def35c45deefde6e7f7a395f"

RPROVIDES:${PN} += "kigo \
kigo5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
