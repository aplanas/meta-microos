SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using Qt/KF5/libfm-qt. \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "xdg-desktop-portal-lxqt-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "26ba7ad5cc1b17e4c30502dc1e5001502efe0fe5b6badb42df98f89aa0bfb57cce33bf6dbd24205ab249ed3230e4bdeb71adf973fce56e74958a3bb45a3f964b"

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
