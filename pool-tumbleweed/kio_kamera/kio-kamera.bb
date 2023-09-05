SUMMARY = "KDE I/O Slave for Cameras"
DESCRIPTION = "This package contains a KIO slave to access digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kio_kamera-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "93e860672fe628e889b9c6546fb5675793c28f9d2fa22a17036bb12fbcf8436d9fde72283cd311e8f821c269edd37e679ca34245325b0ff53a33eb98e0c28996"

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
