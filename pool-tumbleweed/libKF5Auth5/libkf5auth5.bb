SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Auth5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1c27f4b47aa643b4523893c89f44bf42a7dd3025a4486cfe773fab8e63e3007bc6750d96270be54babd1f09fc0f38007da0bdf5fd6199c604141512c8a492002"

RPROVIDES:${PN} += "libKF5Auth.so.5 \
libKF5Auth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5AuthCore5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
