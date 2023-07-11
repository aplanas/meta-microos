SUMMARY = "German Skat game"
DESCRIPTION = "Lieutenant Skat is a nice two player card game which follows the rules \
for the German game (Offiziers)-Skat. The program includes many \
different carddecks to choose. A computer opponent can play for any of \
the players."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "lskat-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4cf76e5afe044017efaf1e48c8f3f299a0d90f96ecd9c7b11bb0a512222328402a11d85ac1a05fb70ee6cc6bcd0acef8ce726c4d1bba3fe5bca7fbf18b25dffa"

RPROVIDES:${PN} += "lskat \
lskat5"

RDEPENDS:${PN} += "kdegames-carddecks-default \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
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
