SUMMARY = "Qt 6 HttpServer library"
DESCRIPTION = "QHttpServer is a simplified API for QAbstractHttpServer and QHttpServerRouter."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HttpServer6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "58a04bd372bb9a4607120ed74ec3208282df1c08c64223e0441a7afb5217abe4bb48b772a368076ceab45dd3df7554fd795fa72b15730c4e59918308ac407763"

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
