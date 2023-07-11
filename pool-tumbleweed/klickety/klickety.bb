SUMMARY = "Strategic board game"
DESCRIPTION = "Klickety is an adaptation of the Clickomania and SameGame games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "klickety-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "716823f4dbf1afe8f8642b64437ead03aa0bc6fbeed3b00daa7861e73178b38e014ae3ebebf4535ea576445fdb64566af73067e36e26440b1df0f9faba2296a2"

RPROVIDES:${PN} += "klickety \
klickety5"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
