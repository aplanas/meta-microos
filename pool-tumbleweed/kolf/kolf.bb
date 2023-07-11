SUMMARY = "Miniature golf game"
DESCRIPTION = "Kolf is a miniature golf game by KDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kolf-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2ac1825f829f40fc14bf3e23f6e187e6f4bdec6952a7f3bef9c78c6688ea027a4bdf9cdc0406fea8aa2219c7c22280a9794f8b15a3a22a06d80d212cc911d6d9"

RPROVIDES:${PN} += "kolf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
