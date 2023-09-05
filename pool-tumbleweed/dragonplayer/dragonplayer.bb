SUMMARY = "Multimedia Player"
DESCRIPTION = "Dragon Player is a simple video player."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "dragonplayer-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "374295bb95264ae97a62d37fcc62fafe3db8b02661988dba44d0bd6d3bf792d91d1de731ded91311e47de7c37a4d4c89d83a6c791b26f89fb25816faaef9b87e"

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
