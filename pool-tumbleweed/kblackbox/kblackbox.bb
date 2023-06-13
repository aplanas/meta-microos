SUMMARY = "Logic game with elements of hide-and-seek"
DESCRIPTION = "KBlackbox is a graphical logical game, inspired by emacs's blackbox. It \
is a game of hide and seek played on an grid of boxes."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kblackbox-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "49621a13f936798f9720fcf148d5c187e9c9174fa341f6e3de11b405cd9049f6927551e90888d1f5d0429690f414a694655ebda48dee6af6c933ef079cd7628a"

RPROVIDES:${PN} += "application() \
application(org.kde.kblackbox.desktop) \
kblackbox \
kblackbox(aarch-64) \
kblackbox5 \
metainfo() \
metainfo(org.kde.kblackbox.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
