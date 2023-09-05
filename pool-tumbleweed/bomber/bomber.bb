SUMMARY = "Game involving the invasion of cities with a plane"
DESCRIPTION = "Bomber is a single player arcade game. The player is invading various cities in \
a plane that is decreasing in height. \
 \
The goal of the game is to destroy all the buildings and advance to the next \
level. Each level gets a harder by increasing the speed of the plane and the \
height of the buildings."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "bomber-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "de94e77c7a2cf6aca168c0a10c8f9d0ca17f46aecd33d48a91ed9321ad50980b8803e30c40add549933d24eff65d025ef0de14dc5e9a5ce8115e38f5e55d6bca"

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
