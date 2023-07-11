SUMMARY = "A WebSockets library written in C"
DESCRIPTION = "Libwebsockets covers some features for people making embedded \
HTTP/WebSocket servers or clients. \
 \
* HTTP(S) serving and client operation \
* WS(S) serving and client operation \
* HTTP(S) APIs for file transfer and upload \
* HTTP POST form handling (including multipart) \
* Cookie-based sessions \
* Account management (including registration, email verification, \
  lost password, etc.) \
* SSL PFS support"
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "libwebsockets19-4.3.2-3.2.aarch64.rpm"
RPM_HASH = "0eb1dbe8e46c8d21a324db760f8cbdcac2f991c9b01661f327949ea6f7e141355f24ce971c8bbd1b8a6479c245a807383472f89f8ef08471076dc8d31bdaf8d9"

RPROVIDES:${PN} += "libwebsockets.so.19 \
libwebsockets19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
