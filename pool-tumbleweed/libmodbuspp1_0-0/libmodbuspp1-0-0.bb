SUMMARY = "C++ wrapper for the libmodbus library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp1_0-0-0.2.3-1.11.aarch64.rpm"
RPM_HASH = "b65652d9dd3e8701049c04ae242016dfb04258d0c5f31e2005687f2cb3405bb3055068adc3a05c2fd1447162d064fd7cdcfa086a6f355161316cceb406fc4526"

RPROVIDES:${PN} += "libmodbuspp.so.1.0-0 \
libmodbuspp1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
