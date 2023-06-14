SUMMARY = "A classic falling blocks game"
DESCRIPTION = "KBlocks is the KDE version of the classic falling blocks game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kblocks-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d7a0bb9b63685654ed3edf80e17987279ca27e5c43c7e5a9854af4ad5c0608ab5c4ea741269496f5e99684738e982e7617bea4daf14f4ee17dc44456dfa9307e"

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
