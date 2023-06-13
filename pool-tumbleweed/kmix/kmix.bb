SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmix-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4020b72cfd9f7d862b1cbce9749c6688ade13affe2092f3a33ece4896ce2b554d909349a40dd56b61a29ad775b67090b54fe0d7631f5b1105ec76e8a334c3b77"

RPROVIDES:${PN} += "application() \
application(org.kde.kmix.desktop) \
config(kmix) \
kmix \
kmix(aarch-64) \
kmix5 \
libkmixcore.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kmix.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcanberra.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
