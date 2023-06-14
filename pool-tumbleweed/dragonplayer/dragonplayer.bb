SUMMARY = "Multimedia Player"
DESCRIPTION = "Dragon Player is a simple video player."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dragonplayer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "70601ec8ef3d83964254006c109866adcb380b76e81414aa0a2c557a2e0c3df490436604bec6acc3d75ba526dc23e7a84e44591c68d27731befdf10ef48fd698"

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
