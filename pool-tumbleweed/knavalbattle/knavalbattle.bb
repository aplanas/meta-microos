SUMMARY = "Battleship game"
DESCRIPTION = "KBatteship is a KDE implementation of the popular game 'Battleship' where \
you have to try to sink the opponents ships. The game can also be \
played with friends online via the internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "knavalbattle-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fa6bba26cc56c2a6146829a65745b97c3e8da029b3b4f4b16261904164f23bd3346ef14fbf2d645e47b2dfa8a3ba8d16ab6af1323daeb75778d59e030a6da6cc"

RPROVIDES:${PN} += "knavalbattle \
knavalbattle5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
