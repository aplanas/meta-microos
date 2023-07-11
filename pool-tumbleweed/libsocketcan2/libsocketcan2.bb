SUMMARY = "Library for SocketCAN"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan2-0.0.12-1.7.aarch64.rpm"
RPM_HASH = "6e5a39dc1c827ab8e9f5fed794ded6fef8f86048a005935485476dc9e90d2ea83e331524b98d38567a9cb970c55b147898941b6e17047d7b80f6eff998dc06ab"

RPROVIDES:${PN} += "libsocketcan.so.2 \
libsocketcan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
