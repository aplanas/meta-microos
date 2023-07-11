SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5GlobalAccelPrivate5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "ec72afb9015d66599dea16f85954ffd31636b0ad673fbc0264097c327f23f1e56f3f95c81e27a2edf4ed342aa5f5542c17edf32167fd2d7d84fde91b02138cca"

RPROVIDES:${PN} += "libKF5GlobalAccelPrivate.so.5 \
libKF5GlobalAccelPrivate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
