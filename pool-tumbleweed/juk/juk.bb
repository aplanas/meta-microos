SUMMARY = "Jukebox"
DESCRIPTION = "Jukebox and music manager by KDE"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "juk-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "63bc40c7c927543e997344b5178675102957ed3c121a182255546a51ee44d3ebb0ac99872c3267601ad2349c35c6312c007567e4cbbada1b2b947b2d0e2b7766"

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
