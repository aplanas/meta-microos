SUMMARY = "Yahtzee-like Game"
DESCRIPTION = "Kiriki is the KDE version of the dice game Yahtzee where you roll dices \
to get higher scores in several combinations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kiriki-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ae2f556327cf0da7282de1cff6d6fc7a430ae73b5c79053451c56b2d44384be4f5fd64db0117684dc51984d91cea133a9fe714057397d925c6fd625875dd6681"

RPROVIDES:${PN} += "kiriki \
kiriki5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
