SUMMARY = "Yahtzee-like Game"
DESCRIPTION = "Kiriki is the KDE version of the dice game Yahtzee where you roll dices \
to get higher scores in several combinations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kiriki-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4398ab860eb92f9b0f2d77ef1b810fd8dc06b58de0edbc45fa90cb306babcc4802ea86d41e22020a419d528894e2272e72081ec04e797413cdc658c1021d2a86"

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
