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

RPM_NAME = "wslay-devel-1.1.1-2.9.aarch64.rpm"
RPM_HASH = "c10c0e453cd510b3df90f42d54902fba0a42fce97f5e07b0b6231f7e82f5ea03bdf5c126d8ab0c6a14110c1a4bd3a4cfb70987396867d6e5cd9a0160637124a7"

RPROVIDES:${PN} += "pkgconfig-libwslay \
wslay-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwslay0"

inherit rpm
