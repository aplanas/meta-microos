SUMMARY = "WebSocket library in C"
DESCRIPTION = "Wslay is a WebSocket library written in C. It implements the protocol version \
13 described in RFC 6455. This library offers 2 levels of API: event-based API \
and frame-based low-level API. For event-based API, it is suitable for \
non-blocking reactor pattern style. You can set callbacks in various events. \
For frame-based API, you can send WebSocket frame directly. Wslay only supports \
data transfer part of WebSocket protocol and does not perform opening handshake \
in HTTP. \
 \
Wslay supports: \
 \
Text/Binary messages. \
Automatic ping reply. \
Callback interface. \
External event loop. \
 \
Wslay does not perform any I/O operations for its own. Instead, it offers \
callbacks for them. This makes Wslay independent on any I/O frameworks, SSL, \
sockets, etc. This makes Wslay portable across various platforms and the \
application authors can choose freely I/O frameworks."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "wslay-1.1.1-2.9.aarch64.rpm"
RPM_HASH = "dc8b117027a3e3bbffb91539f3f0ff2a2c8916997d3fb71cb3c438c004a9f38c97023b17ef64facdd677f8a02dbb9ea02bc613c33abdccf54aef046a064c0e28"

RPROVIDES:${PN} += "wslay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6 \
libwslay.so.0"

inherit rpm
