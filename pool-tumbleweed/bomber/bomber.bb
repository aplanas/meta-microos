SUMMARY = "Game involving the invasion of cities with a plane"
DESCRIPTION = "Bomber is a single player arcade game. The player is invading various cities in \
a plane that is decreasing in height. \
 \
The goal of the game is to destroy all the buildings and advance to the next \
level. Each level gets a harder by increasing the speed of the plane and the \
height of the buildings."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bomber-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e33baba1ab82256bf6390171787c4db3302d4158967e8549218cd35734779da2de9021918173de79503e1ccb84aa088ec265ed3f110c1b4e0db6d046f9badc49"

RPROVIDES:${PN} += "bomber \
bomber5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
