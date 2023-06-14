SUMMARY = "Modbus Library"
DESCRIPTION = "libmodbus is a free software library to send/receive data with a device which \
respects the Modbus protocol. This library can use a serial port or an Ethernet \
connection. \
 \
The functions included in the library have been derived from the Modicon Modbus \
Protocol Reference Guide which can be obtained from Schneider."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.10"

RPM_NAME = "libmodbus5-3.1.10-1.2.aarch64.rpm"
RPM_HASH = "1a015a57c43842b8712e0c28926d27f520f5e67c8da6c2cb712364dbb7e1d3b03aaf4b46d4b29294617d95f0867ffaaa16c26268e1242654e0fe1992fb4cd37a"

RPROVIDES:${PN} += "libmodbus.so.5 \
libmodbus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
