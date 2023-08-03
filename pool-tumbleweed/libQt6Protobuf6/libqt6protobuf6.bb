SUMMARY = "Qt 6 Protobuf library"
DESCRIPTION = "The Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Protobuf6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a280543bb833f12d7b4cbe8fe946498d5f868c4e98d310b806478a4561c019bded7e59788f68835964e8fdcb0612533c962fc4783e1da5d3b3c8d70cc5c82904"

RPROVIDES:${PN} += "libQt6Protobuf.so.6 \
libQt6Protobuf6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
