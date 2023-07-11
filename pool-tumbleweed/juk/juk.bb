SUMMARY = "Jukebox"
DESCRIPTION = "Jukebox and music manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "juk-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "bcfbef86dd4d6628780ffb528321646d67b94e8dc2c97e4464ba2546c978bef8d4c5c86adf379c28904771281451f09eb5c345ca7df6158d411c13b3131c1fa8"

RPROVIDES:${PN} += "juk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
