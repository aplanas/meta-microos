SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5SerialBus5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0474b27754cf5fda12e3ecf419cacd8855b7251b9d467f4fbf74a84200f92344d3ad08dc6a2f664593dc1d25260ef17edab87584469ffcb4eafe30bc73e39e2d"

RPROVIDES:${PN} += "libQt5SerialBus.so.5 \
libQt5SerialBus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5SerialPort.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
