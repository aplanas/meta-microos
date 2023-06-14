SUMMARY = "Pac-Man-like game by KDE"
DESCRIPTION = "Kapman is a clone of the well known game Pac-Man. You must go through the levels \
escaping ghosts in a maze. You lose a life when a ghost eats you, but you can \
eat the ghosts for a few seconds when eating an energizer. You win points when \
eating pills, energizers, and bonus, and you win one life for each 10,000 \
points. When you have eaten all the pills and energizers of a level, you go to \
the next level, and the player and ghost speeds increase. The game ends when you \
have lost all your lives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kapman-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f6e3050fc656affdfb754829074329d1984f0a4ac7e38dad78258882c78a2ecf06a7a6177d46e649e916de4c9ee9d81125c8d80a7b1f8743b2d752709469fba8"

RPROVIDES:${PN} += "kapman \
kapman5"

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
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
