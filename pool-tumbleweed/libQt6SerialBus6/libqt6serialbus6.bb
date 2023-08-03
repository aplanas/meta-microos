SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "The Qt SerialBus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6SerialBus6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2efe15f2e3a67f90f805ebe62bfc560fde94144e0063d22ad49aa5b7b3a721c5ebdfc9f9c81a0787c7d6f1a6028cd728aebfc6e9044eae53d442c43956e05355"

RPROVIDES:${PN} += "libQt6SerialBus.so.6 \
libQt6SerialBus6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
