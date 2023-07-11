SUMMARY = "Qt5 Data Visualization module"
DESCRIPTION = "Qt Data Visualization module provides a way to visualize data in 3D. \
 \
This package contains a shared library for the QtDataVisualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5DataVisualization5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c94e487681570c68c0053cdf03c9a7c29d126e3ae13a3d5834f347da5bba31249215f428f5b9e73f56313e8fd54d5bf728577a1bae3f3e855b11f7774f05ec59"

RPROVIDES:${PN} += "libQt5DataVisualization.so.5 \
libQt5DataVisualization5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
