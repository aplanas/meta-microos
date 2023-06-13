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

RPROVIDES:${PN} += "nghttp2 \
nghttp2(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libev.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libjansson.so.4()(64bit) \
libm.so.6()(64bit) \
libnghttp2.so.14()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
