SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "The Qt SerialBus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SerialBus6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4d2edb23f5e59a98cc6b70714502313c18830218b5e3746b01ca415a16f10691a04a0df889397d1adbd35a273e46a9af89224ad1ce0b87d676225dfcd3524fe4"

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
