SUMMARY = "Five-in-a-row Board Game"
DESCRIPTION = "Bovo is a Gomoku (Connect Five, Five in a row, X and O, etc) game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "bovo-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "248141a130a87a2425ffdc8af54cd6408d26716e9481129d9e1424ba0cf1f05adad5faa49b3feb5c08d63e03645e23ffbb4527ec3fce669a5c9785622f3df051"

RPROVIDES:${PN} += "bovo \
bovo5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
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
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
