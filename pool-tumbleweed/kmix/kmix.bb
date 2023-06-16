SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmix-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4020b72cfd9f7d862b1cbce9749c6688ade13affe2092f3a33ece4896ce2b554d909349a40dd56b61a29ad775b67090b54fe0d7631f5b1105ec76e8a334c3b77"

RPROVIDES:${PN} += "config-kmix \
kmix \
kmix5 \
libkmixcore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libcanberra.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
