SUMMARY = "Tactical game"
DESCRIPTION = "Klines is the KDE version of the russian game Lines where you have to \
align five game pieces of the same colour in one line to remove them \
from the game board. Similar to tetris you fight new pieces appearing."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "klines-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "873a099fc351c4230b359831261a0fb83ad7c669286a105d0d59d9d947a4e3e3f93a5d91da3b042f74f42dfd9f0197e645ee8c60ea8d81367360c775f9eefccc"

RPROVIDES:${PN} += "klines \
klines5"

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
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
