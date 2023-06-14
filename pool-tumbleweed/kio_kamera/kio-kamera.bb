SUMMARY = "KDE I/O Slave for Cameras"
DESCRIPTION = "This package contains a KIO slave to access digital cameras."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kio_kamera-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "67b433ca9f20f84f3d3b9b803f6675ffcdb778796bd2a6acd88b98a82cdddf64083b95647159bf04a191afb9d9b292ab269d3af2a68969d2ec08a0755054193a"

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
