SUMMARY = "Battleship game"
DESCRIPTION = "KBatteship is a KDE implementation of the popular game 'Battleship' where \
you have to try to sink the opponents ships. The game can also be \
played with friends online via the internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knavalbattle-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2f100a9b5155405243102abb0b29c1333e8af79bb248a80b0b209659c50a4f1a8cd2f4229370c679be2828b27b5ba552ffcbff6cbbbd2e9ea3cb1e1c1ef84428"

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
