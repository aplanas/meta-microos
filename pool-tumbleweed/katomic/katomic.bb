SUMMARY = "Sokoban-like logic game"
DESCRIPTION = "KAtomic is a thinking game where you have to form chemical molecules \
out of atoms. This is done with a nice graphical interface where you \
can move each atom in a labyrinth."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "katomic-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e8502cb9c41521b994bb321ba27c2edaaa294e20e59314177d29cf428f3c5c0191121d302085591948d479296a5f0f7e68e9bcbba25cc0210d81efd60791fdf3"

RPROVIDES:${PN} += "katomic \
katomic5"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
