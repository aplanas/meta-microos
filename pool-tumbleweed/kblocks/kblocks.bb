SUMMARY = "A classic falling blocks game"
DESCRIPTION = "KBlocks is the KDE version of the classic falling blocks game."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kblocks-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "435651d04ffdb29a3740d8594c878792db654a00a9f6fa48fda893b170c94768272c456e51fbca92ea27b2de3ae2a27ff7f1878db6f8486d9d29d2572831ec4d"

RPROVIDES:${PN} += "kblocks \
kblocks5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
