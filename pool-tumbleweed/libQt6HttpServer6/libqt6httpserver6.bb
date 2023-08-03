SUMMARY = "Qt 6 HttpServer library"
DESCRIPTION = "QHttpServer is a simplified API for QAbstractHttpServer and QHttpServerRouter."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6HttpServer6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ed4c19e157a7b48cf0adf03dc59252190b90c84d968f8c7a5f4c994a63b59d95e29e298db5828bde83f6de741478f820f35b29c61e755aad25a67faa88520078"

RPROVIDES:${PN} += "libQt6HttpServer.so.6 \
libQt6HttpServer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
