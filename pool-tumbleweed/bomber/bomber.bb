SUMMARY = "Game involving the invasion of cities with a plane"
DESCRIPTION = "Bomber is a single player arcade game. The player is invading various cities in \
a plane that is decreasing in height. \
 \
The goal of the game is to destroy all the buildings and advance to the next \
level. Each level gets a harder by increasing the speed of the plane and the \
height of the buildings."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "bomber-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9c6f5555841e40b1abd45e04347f7fc68a8657cfbdca35678f6ea6c50aa7aae297c511a9b359bf358497e3aac7396695d194bc5e4cc880900391ca5284a12c96"

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
