SUMMARY = "Robots-like game by KDE"
DESCRIPTION = "Killbots is a turn-based game of evading 'killer' robots on a board. \
Robots home in on the player, but can crash into other robots or \
debris, rendering them inert. The player has to strategically move \
and can optionally use teleportation to a random location."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "killbots-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5b161ce380638fea34937e4cbd8cbc6eb2ada9d0ad3499764f726585fd9ebb30ec387410c75334ce160baaa7ca6c53070f542b50f463dce63bbcfd728e3775e7"

RPROVIDES:${PN} += "killbots \
killbots5"

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
libm.so.6 \
libstdc++.so.6"

inherit rpm
