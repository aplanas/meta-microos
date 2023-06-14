SUMMARY = "Qt 6 HttpServer library"
DESCRIPTION = "QHttpServer is a simplified API for QAbstractHttpServer and QHttpServerRouter."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HttpServer6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6aaaf9c878d61d1c73353aa7655ccccd11efc5cc4a0303a412f8e60b1b44330b64b642ff1060f48f6e25a872d48490bf32a561b2564f94adc345581fe57deff0"

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
