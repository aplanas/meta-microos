SUMMARY = "C++ wrapper for the libmodbus library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp1_0-0-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "f255b7b9f80bb2bc0781b32015057c4dcfb8b0423df5a60f48e5ffb37fc196728108eab85ff7c220b9d745e259054659bc75215bcfff563a32eb02787ed1bc5f"

RPROVIDES:${PN} += "libmodbuspp.so.1.0-0 \
libmodbuspp1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
