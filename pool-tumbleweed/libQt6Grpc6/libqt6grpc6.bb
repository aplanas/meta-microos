SUMMARY = "Qt 6 Grpc library"
DESCRIPTION = "The Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Grpc6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4bd84056651a4f85bf7a471e905c9496d3cba0802deb2c29eb9f7beee06f8e383025e1c139eeb3231fb0918ed81f83426176088fb21703d01389e7c83b502d52"

RPROVIDES:${PN} += "libQt6Grpc.so.6 \
libQt6Grpc6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Protobuf.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
