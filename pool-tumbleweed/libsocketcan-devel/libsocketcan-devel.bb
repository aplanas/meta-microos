SUMMARY = "Development files for the SocketCAN library"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed. \
 \
This package contains the libsocketcan development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan-devel-0.0.12-1.7.aarch64.rpm"
RPM_HASH = "845e1f017be72ece09ee780db04bd66ecd80b33484c5e6a74024c3c6a0eb1e2d2065a5b00f79650fa646179ffeab7f915eb066a0dbd5f8e5c9285a8e9293fb19"

RPROVIDES:${PN} += "libsocketcan-devel \
pkgconfig-libsocketcan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocketcan2"

inherit rpm
