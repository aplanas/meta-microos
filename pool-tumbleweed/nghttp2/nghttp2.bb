SUMMARY = "Implementation of Hypertext Transfer Protocol version 2 in C"
DESCRIPTION = "This is an implementation of Hypertext Transfer Protocol version 2. \
 \
The framing layer of HTTP/2 is implemented as a form of reusable C library. \
On top of that, we have implemented HTTP/2 client, server and proxy. We \
have also developed load test and benchmarking tool for HTTP/2. \
 \
HPACK encoder and decoder are available as public API."
LICENSE = "MIT"

PV = "1.54.0"

RPM_NAME = "nghttp2-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "cbff23a22b03087ddea6dd1df09d6a2087e334d005e2b5a15460c916b0e517c9b7b603939f1a453c466c7da741716c9abcd4709c45c6c5ce6a23ddf61691f439"

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
