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

RPM_NAME = "libwebsockets19-4.3.2-3.1.aarch64.rpm"
RPM_HASH = "c831b5d537fc938d795e4c9420064a028a93f8333769bfb39163c6eefc674b6cc65b21a8adb22c9956987f4d65aa99c67152b3d12f9edf7fd306cf00db3106ff"

RPROVIDES:${PN} += "libwebsockets.so.19()(64bit) \
libwebsockets19 \
libwebsockets19(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
