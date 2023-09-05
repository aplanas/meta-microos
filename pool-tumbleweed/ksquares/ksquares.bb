SUMMARY = "'Dots and boxes' board game"
DESCRIPTION = "KSquares is an implementation of the popular paper-based game \
squares, better known as 'La Pipopipette' in its original French \
form, or 'Dots and Boxes' in English. One must draw lines to complete \
squares, and the player with the most squares wins. This \
implementation can be played with up to 4 players, any number of \
which may be controlled by the computer."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ksquares-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "94576d9eab9de3e35793b54bdf462e5560fe5ad971e9035a99a9711587ffacf678db7633766d660d68cff8d08be3428814cc89a428f1f344b1578675adf3218f"

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
