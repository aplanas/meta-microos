SUMMARY = "Logic game with elements of hide-and-seek"
DESCRIPTION = "KBlackbox is a graphical logical game, inspired by emacs's blackbox. It \
is a game of hide and seek played on an grid of boxes."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kblackbox-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3187cde38410cd8a078e73675c85e896156933a141c50d368d64b3274e4b96cf83997d64a21756c13c40e4115b4e647bda1bfd634f7845c9c262922de82dc179"

RPROVIDES:${PN} += "kblackbox \
kblackbox5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
