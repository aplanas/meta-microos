SUMMARY = "Development Files for Modbus Library"
DESCRIPTION = "libmodbus is a free software library to send/receive data with a device which \
respects the Modbus protocol. This library can use a serial port or an Ethernet \
connection. \
 \
The functions included in the library have been derived from the Modicon Modbus \
Protocol Reference Guide which can be obtained from Schneider."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.10"

RPM_NAME = "libmodbus-devel-3.1.10-1.2.aarch64.rpm"
RPM_HASH = "caf3c53d7d47dfa927dc53e6709a8a71140686bf0089a238ac61ad506c5ff95797e6caef03063ae5f84b0f23960db3caaf97f9398eaadc02907ef4c683c19925"

RPROVIDES:${PN} += "libmodbus-devel \
libmodbus-devel(aarch-64) \
pkgconfig(libmodbus)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmodbus5"

inherit rpm
