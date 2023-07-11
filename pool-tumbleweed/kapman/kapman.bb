SUMMARY = "Pac-Man-like game by KDE"
DESCRIPTION = "Kapman is a clone of the well known game Pac-Man. You must go through the levels \
escaping ghosts in a maze. You lose a life when a ghost eats you, but you can \
eat the ghosts for a few seconds when eating an energizer. You win points when \
eating pills, energizers, and bonus, and you win one life for each 10,000 \
points. When you have eaten all the pills and energizers of a level, you go to \
the next level, and the player and ghost speeds increase. The game ends when you \
have lost all your lives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kapman-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "50101dfd1d24264680143341b3d0af6814fb80b862bcf22186a6c8305384021b641544fe41cf1bdd4d76b9f1b4fb7a91903ee86f16ff65c6dd8bf01d34c996e1"

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
