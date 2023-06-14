SUMMARY = "SPDY C Library"
DESCRIPTION = "This is an experimental implementation of Google’s SPDY protocol in \
C. This library provides SPDY version 2, 3 and 3.1 framing layer \
implementation. It does not perform any I/O operations but uses \
callback functions provided by the application. Likewise, it includes \
no event polling mechanism, so the application can freely choose. \
Except for sample programs, this library code does not depend on any \
particular SSL library."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "spdylay-1.4.0-3.26.aarch64.rpm"
RPM_HASH = "a8ab74f26ec5f67a2d3fd3f4ce4f7ce2924fc374eff546614cb369a6704970fe2e84e728e8a76f9acda707c8c74813f58731bb95da63371805df3833b8a209ce"

RPROVIDES:${PN} += "spdylay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libevent-openssl-2.1.so.7 \
libgcc-s.so.1 \
libspdylay.so.7 \
libssl.so.3 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
