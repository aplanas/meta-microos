SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Solid5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "37ae1c4eefd36c3fe4b81e50c83092b5b6b737d5faedebabb2b4786db140be8004b196aef77c64aea5a40947e6870d4fdead0603b6bad7ab09ffa904c07f56f1"

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
