SUMMARY = "Qt 6 Grpc library"
DESCRIPTION = "The Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Grpc6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ab09c58882086585b3ac11c08efb29e27d691de56f0ff3a947ffffa54940d47dd8fbe0022f9cdb81ef4ee392cd64e5ebc77388e4690a6059e731b9387f4f00ee"

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
