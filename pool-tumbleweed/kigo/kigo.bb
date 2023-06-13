SUMMARY = "Traditional Chinese Boardgame by KDE"
DESCRIPTION = "Traditional Chinese Boardgame."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kigo-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8b79766b8970c74df21309a629044d9d61f44e6d38974242dbce40efba189d76d47e5d22301621bf1b8a267b69a9f5afaa960b06def35c45deefde6e7f7a395f"

RPROVIDES:${PN} += "application() \
application(org.kde.kigo.desktop) \
kigo \
kigo(aarch-64) \
kigo5 \
metainfo() \
metainfo(org.kde.kigo.appdata.xml) \
mimehandler(application/x-go-sgf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
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
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
