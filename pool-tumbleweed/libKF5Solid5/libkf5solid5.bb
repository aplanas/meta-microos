SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Solid5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "8fe314a526e01a1141ffef00e0e55f6734627ceaf2a8a1dcfe9c71a93701ffc1a07f2d45eca24f513de0ec541f873a6d822a69bc70eca91fb24f36462263737c"

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
libplist-2.0.so.3 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
