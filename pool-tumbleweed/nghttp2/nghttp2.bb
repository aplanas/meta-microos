SUMMARY = "Implementation of Hypertext Transfer Protocol version 2 in C"
DESCRIPTION = "This is an implementation of Hypertext Transfer Protocol version 2. \
 \
The framing layer of HTTP/2 is implemented as a form of reusable C library. \
On top of that, we have implemented HTTP/2 client, server and proxy. We \
have also developed load test and benchmarking tool for HTTP/2. \
 \
HPACK encoder and decoder are available as public API."
LICENSE = "MIT"

PV = "1.53.0"

RPM_NAME = "nghttp2-1.53.0-1.1.aarch64.rpm"
RPM_HASH = "0574dddff0e129355f9ffe01a730baab6a856a7c9d7de0e17b0addb070da70fc4c34cdc47e909cbd5cffe41fea40b71feccd16850f17d0d89b79d112c235e16e"

RPROVIDES:${PN} += "nghttp2"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libev.so.4 \
libgcc-s.so.1 \
libjansson.so.4 \
libm.so.6 \
libnghttp2.so.14 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
