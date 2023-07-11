SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using Qt/KF5/libfm-qt. \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "xdg-desktop-portal-lxqt-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "93e0e4d1153efa925f7eecba1050ab2050d8a89ce6d40519978425b0f54e5a2669ae76a81f75235e9ed1846295634608e0754987de15c45a349be4a287ebac78"

RPROVIDES:${PN} += "xdg-desktop-portal-lxqt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfm-qt.so.13 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
