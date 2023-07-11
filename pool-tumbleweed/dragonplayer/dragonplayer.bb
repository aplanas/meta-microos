SUMMARY = "Multimedia Player"
DESCRIPTION = "Dragon Player is a simple video player."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "dragonplayer-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ef596e799c3ec1a3a79481f3395689731d04f669499b8f511ac8f990606d3332b7e2e2e1b6bee840576c7be1c4a7e15e3f87b80baa6a71f5c0fe90f12570bb88"

RPROVIDES:${PN} += "config-dragonplayer \
dragonplayer \
dragonplayer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
