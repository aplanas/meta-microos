SUMMARY = "Battleship game"
DESCRIPTION = "KBatteship is a KDE implementation of the popular game 'Battleship' where \
you have to try to sink the opponents ships. The game can also be \
played with friends online via the internet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "knavalbattle-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "828b7665c3e62f7faf9b1db864ba00df9b6ca14117b079f715a4164155fe0a99da09adf692eba03e4342b56c9a4e9af4a502be4af296eab94c12c50cf19a6b01"

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
