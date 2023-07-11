SUMMARY = "KDE I/O Slave for Cameras"
DESCRIPTION = "This package contains a KIO slave to access digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kio_kamera-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "62a15f235da77873ab30c9afc5bd7e0d56abaa43484ea9b5479213334d2b1ed94379d6cbedc64109c2621f04b0e510121e237ba07f9009b3883911a721250a47"

RPROVIDES:${PN} += "kamera \
kio-kamera"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libstdc++.so.6"

inherit rpm
