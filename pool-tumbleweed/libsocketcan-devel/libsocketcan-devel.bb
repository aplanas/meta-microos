SUMMARY = "Development files for the SocketCAN library"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed. \
 \
This package contains the libsocketcan development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan-devel-0.0.12-1.6.aarch64.rpm"
RPM_HASH = "8b3f58d4ec2c9d8173cef06944a322a176bd727322edf6cfa488729ed5d3a50280419506c8fb691eab93bc0a21a9a501b53e3eef91d618dc44d9997df8521e00"

RPROVIDES:${PN} += "libsocketcan-devel \
libsocketcan-devel(aarch-64) \
pkgconfig(libsocketcan)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocketcan2"

inherit rpm
