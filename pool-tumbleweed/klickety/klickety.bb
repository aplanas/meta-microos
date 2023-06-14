SUMMARY = "Strategic board game"
DESCRIPTION = "Klickety is an adaptation of the Clickomania and SameGame games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "klickety-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "14ea46155abea6f74febde5f95160f7ef091f0e43fc9c10b5fa01eafb7a317726960c4a7d5e0708b0905e07262ede5b7df1e79d59ea8e016af97b143c72a159f"

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
