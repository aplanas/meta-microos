SUMMARY = "A classic falling blocks game"
DESCRIPTION = "KBlocks is the KDE version of the classic falling blocks game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kblocks-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8765d8264536c0e65feb002d31a532e54302ccef1ea2dd00bc9fb39f9fe5ec2426944e93b944e0543a5c7d3eb4916ee1ab0ea18d40b0dd03b515576af729cf9b"

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
