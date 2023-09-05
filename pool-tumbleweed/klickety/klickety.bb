SUMMARY = "Strategic board game"
DESCRIPTION = "Klickety is an adaptation of the Clickomania and SameGame games."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "klickety-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d6e78fea4a0d27ff5935c36ce92499091f9d2b7f9331d06f1f2569a32b9144066cbfadb9d4aee9a0edd03c782e1422fad8eddb1af5283cd0d0ad303025de17f9"

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
