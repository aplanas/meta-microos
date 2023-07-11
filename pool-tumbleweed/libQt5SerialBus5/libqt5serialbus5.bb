SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5SerialBus5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "79a1e5bdc0e6fe9487d96eb61374ca6e103a8c77f69db7d4090638b5be9a3b7a4482a1d4f0bc54d99b0f8b0fc2acc6f15932ef31d6014d1ce106c866ad7694c1"

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
