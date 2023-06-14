SUMMARY = "'Dots and boxes' board game"
DESCRIPTION = "KSquares is an implementation of the popular paper-based game \
squares, better known as 'La Pipopipette' in its original French \
form, or 'Dots and Boxes' in English. One must draw lines to complete \
squares, and the player with the most squares wins. This \
implementation can be played with up to 4 players, any number of \
which may be controlled by the computer."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksquares-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5e2f4e8ac4941a4f9df41b87a1341fb91531cdf91ce97b6542fd57be29c09c5ed1e8d4d65553256f49b9134a914f29ccd3a4dfd58b6a3eccb0f336b0c6a4b828"

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
