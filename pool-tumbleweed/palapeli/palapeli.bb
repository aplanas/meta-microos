SUMMARY = "Jigsaw puzzle game"
DESCRIPTION = "Palapeli is a jigsaw puzzle game. Unlike other games in that genre, you are not \
limited to aligning pieces on imaginary grids. The pieces are freely moveable. \
Also, Palapeli features real persistency, i.e. everything you do is saved on \
your disk immediately."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "palapeli-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "750dd2b84409867efa75a75bf192aed9959881651ec5516cce946f03cf56d640425702a4dccf7e32b25c82b748b1c70d64784be84afe0029be1d80794efd0c9c"

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
