SUMMARY = "Patience card game"
DESCRIPTION = "KPatience is a collection of various patience games known all over the \
world. It includes Klondike, Freecell, Yukon, Forty and Eight and many \
more. The game has nice graphics and many different carddecks."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kpat-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7bd007f8225701f26e877f90de6a720b712a74c0cd051649be2c4d9d7f5138203ec7747069d08882f71760ce5146e093742ef364b32d4f2d0ede399e94e7efdb"

RPROVIDES:${PN} += "kpat \
kpat5 \
libkcardgame.so"

RDEPENDS:${PN} += "kdegames-carddecks-default \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libblack-hole-solver.so.1 \
libc.so.6 \
libfreecell-solver.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
