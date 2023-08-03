SUMMARY = "Implementation of Hypertext Transfer Protocol version 2 in C"
DESCRIPTION = "This is an implementation of Hypertext Transfer Protocol version 2. \
 \
The framing layer of HTTP/2 is implemented as a form of reusable C library. \
On top of that, we have implemented HTTP/2 client, server and proxy. We \
have also developed load test and benchmarking tool for HTTP/2. \
 \
HPACK encoder and decoder are available as public API."
LICENSE = "MIT"

PV = "1.55.1"

RPM_NAME = "nghttp2-1.55.1-1.1.aarch64.rpm"
RPM_HASH = "8c3a9a74849067433944c36f223a214478c79136930f1c5ffe0c0038a3314e623bbc4dd59ba1915fe1cda421726a2e25fdade66026d89d5db0df9a34755d96fb"

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
