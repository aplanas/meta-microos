SUMMARY = "Jigsaw puzzle game"
DESCRIPTION = "Palapeli is a jigsaw puzzle game. Unlike other games in that genre, you are not \
limited to aligning pieces on imaginary grids. The pieces are freely moveable. \
Also, Palapeli features real persistency, i.e. everything you do is saved on \
your disk immediately."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "palapeli-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2a053cba912803493806266fc66fc541fb6be1e5cb94bdf9e442fb2bebef8eae5a0c36fe81c683bc5ec4b79a55cbd0b60e88d811f5b43944547b66a8edcfe5c0"

RPROVIDES:${PN} += "application() \
application(org.kde.palapeli.desktop) \
libpala.so.0()(64bit) \
metainfo() \
metainfo(org.kde.palapeli.appdata.xml) \
mimehandler(application/x-palapeli-puzzle) \
palapeli \
palapeli(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
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
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
palapeli-data"

inherit rpm
