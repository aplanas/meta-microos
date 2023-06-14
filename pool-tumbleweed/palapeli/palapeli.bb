SUMMARY = "Jigsaw puzzle game"
DESCRIPTION = "Palapeli is a jigsaw puzzle game. Unlike other games in that genre, you are not \
limited to aligning pieces on imaginary grids. The pieces are freely moveable. \
Also, Palapeli features real persistency, i.e. everything you do is saved on \
your disk immediately."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "palapeli-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2a053cba912803493806266fc66fc541fb6be1e5cb94bdf9e442fb2bebef8eae5a0c36fe81c683bc5ec4b79a55cbd0b60e88d811f5b43944547b66a8edcfe5c0"

RPROVIDES:${PN} += "libpala.so.0 \
palapeli"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
palapeli-data"

inherit rpm
