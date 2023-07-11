SUMMARY = "'Dots and boxes' board game"
DESCRIPTION = "KSquares is an implementation of the popular paper-based game \
squares, better known as 'La Pipopipette' in its original French \
form, or 'Dots and Boxes' in English. One must draw lines to complete \
squares, and the player with the most squares wins. This \
implementation can be played with up to 4 players, any number of \
which may be controlled by the computer."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ksquares-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c9078b0a692f49023c15cd2e940a213c87d9ee19353a8d5d7d5ea00b3e3db280d3d97dbc0611b2d0fb121a645d55f5d0e9504c6de4c87d12011ccd8f1537e5b7"

RPROVIDES:${PN} += "ksquares \
ksquares5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
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
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
