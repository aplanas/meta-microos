SUMMARY = "WebSockets C Library"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
This package holds the shared C library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libwslay0-1.1.1-2.9.aarch64.rpm"
RPM_HASH = "8c747ad4e184b9905952817cdc0cccbd1c8036b543e9291f7c638f19dbe7de9410938a6c966a5cd8347a31e86e9414c6da4b28d1afc1035cd088d4bae65da3ef"

RPROVIDES:${PN} += "libwslay.so.0 \
libwslay0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
