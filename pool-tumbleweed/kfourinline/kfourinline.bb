SUMMARY = "Four Wins game"
DESCRIPTION = "Four wins is a two-player board game where you have to align four \
(gravity-affected) pieces of the same colour to win."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kfourinline-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bee9cf7d8e49dda8edc3679b93e096a3c612c8ccd7170fe33d1bd7b1a5077a036b921524b208fba9543f8f4c118c31abe0cfb3e15201b1657212c39034b13cca"

RPROVIDES:${PN} += "kfourinline \
kfourinline5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KDEGamesPrivate.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
