SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5JobWidgets5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "dc53ec28fa25884451914d6c20f753b1b86e798a61dc92533745ae550dcb214932e976f47381dedae373318f5e3a40bddfe5260ca730d75318963f402500a057"

RPROVIDES:${PN} += "libKF5JobWidgets.so.5 \
libKF5JobWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
