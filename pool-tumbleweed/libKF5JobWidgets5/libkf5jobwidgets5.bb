SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5JobWidgets5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "52672562f47252c2f59eed6ebfed5bd2cfadcaf11c36c80ed82c36a1e44d61c4f6005a88b63fe78db097d92759dc0f73aa84800141f13061a126d2075bc0a6df"

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
