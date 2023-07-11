SUMMARY = "Development files for the libmodbuspp library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodbuspp."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp-devel-0.2.3-1.11.aarch64.rpm"
RPM_HASH = "0f6153fce2a828b70cdb4e1ee2abc33759e40cfc2c8b65cdaa2f6f7ff83988b6a4e3dd1f2fbeaf6dfd58aa2aa44963b7f2c88bc3fa1a059020b21dc9609ab754"

RPROVIDES:${PN} += "libmodbuspp-devel \
pkgconfig-libmodbuspp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodbuspp1-0-0"

inherit rpm
