SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Auth5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "d8933e09436e454dcbd9a1de68b72f071dd8663997e2459a9012b18bbfe1e049123e81f50110928675bde1f73420ab33730657afa7cf7bade5668d30b529e815"

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
