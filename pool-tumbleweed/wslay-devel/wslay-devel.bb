SUMMARY = "Development files for the wslay WebSockets library"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "wslay-devel-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "933384480724ea9fb81d32c002f8d1a9ae73b64483a626c502b40f08077ba06ff96de3488be21a1284c4403a2444ad6a4a56a88f9e0131edce0998df39552d5c"

RPROVIDES:${PN} += "pkgconfig-libwslay \
wslay-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwslay0"

inherit rpm
