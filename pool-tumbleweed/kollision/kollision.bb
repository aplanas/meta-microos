SUMMARY = "Kollision game"
DESCRIPTION = "KDE version of a classic arcade game"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kollision-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b4efc3c0b07100c115af1f86195c81639e6b5fb14dd135591a93b2ef44258fe0cdf4b3e0875d2c659afd2df4609b237e0f39bf92a224cf5d5a98b495aa993705"

RPROVIDES:${PN} += "kollision \
kollision5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
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
libm.so.6 \
libstdc++.so.6"

inherit rpm
