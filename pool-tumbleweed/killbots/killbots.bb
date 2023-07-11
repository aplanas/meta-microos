SUMMARY = "Robots-like game by KDE"
DESCRIPTION = "Killbots is a turn-based game of evading 'killer' robots on a board. \
Robots home in on the player, but can crash into other robots or \
debris, rendering them inert. The player has to strategically move \
and can optionally use teleportation to a random location."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "killbots-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "41f49f8db29e19e805b4f8a92320845d726e36634172d45817c8af6c123f9cbc138227b397b5220dc15946677d5a072ce7bdf7f746711a7f3fb48b08acf9cdff"

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
