SUMMARY = "Shisen-Sho Mahjongg-like game"
DESCRIPTION = "Shisen-Sho (KShishen) is a game similar to Mahjongg. The object of the \
game is to remove all tiles from the field. This is done by removing \
two tiles with of the same type until no tile is left."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kshisen-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f7a2394fae7cc6e374fd89de4c07b5821680a67480a70c9356a4b7110d714658ef02925dab2dad70634c0f8294a9f0af934dbd03c6449b58a97da748e554d8ba"

RPROVIDES:${PN} += "kshisen \
kshisen5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KMahjongglib.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
