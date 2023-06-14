SUMMARY = "Five-in-a-row Board Game"
DESCRIPTION = "Bovo is a Gomoku (Connect Five, Five in a row, X and O, etc) game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bovo-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "618605a77873443f1b836c2e66e20bc1f6f4804ee6f875283476d6e0bb3f222ff7c89e4a6814dc1e2c01757e2d8f323c1d3afd33658f4c49c14ee2d37baea09a"

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
