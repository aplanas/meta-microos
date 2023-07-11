SUMMARY = "Mahjongg game"
DESCRIPTION = "KMahjongg is a clone of the well known tile based patience game of the \
same name. In the game you have to empty a game board filled with piece \
by removing pieces of the same type."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmahjongg-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3ca9e2bbd78299753dd5c6bba6a0f1babae9ef26ea13f0b9cb5dd7bda1ded498ed5b84aefe5301232594545fb880959fa1d3f62b19ea1379e870e0c0c285b79c"

RPROVIDES:${PN} += "kmahjongg \
kmahjongg5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KMahjongglib.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
