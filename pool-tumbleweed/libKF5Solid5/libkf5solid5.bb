SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Solid5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6f33ab5dd2fcc739b03dede65f1d7069051a78b1873350c5b08e0a0f1aa7354b2876952a2c8ad20283a02089ab019e8f1c01e85028ddb7a5bc813a61df2d8bd0"

RPROVIDES:${PN} += "libKF5Solid.so.5 \
libKF5Solid5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libimobiledevice-1.0.so.6 \
libmount.so.1 \
libplist-2.0.so.4 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
