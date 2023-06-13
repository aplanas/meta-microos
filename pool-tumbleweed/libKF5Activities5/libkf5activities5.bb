SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Activities5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "986e9ddc74d655e4ae53f79cf6d638e6d8da1a5bf551ab5ccf8d3dea5e88782ebfec4c2348f87500204494abe82a34bbeb048f6cc800e5ea0e6076539df5ddc5"

RPROVIDES:${PN} += "libKF5Activities.so.5()(64bit) \
libKF5Activities5 \
libKF5Activities5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
