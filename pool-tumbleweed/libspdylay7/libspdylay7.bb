SUMMARY = "SPDY C Library"
DESCRIPTION = "This is an experimental implementation of Google’s SPDY protocol in \
C. This library provides SPDY version 2, 3 and 3.1 framing layer \
implementation. It does not perform any I/O operations but uses \
callback functions provided by the application. Likewise, it includes \
no event polling mechanism, so the application can freely choose. \
 \
This package holds the shared C library."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "libspdylay7-1.4.0-3.27.aarch64.rpm"
RPM_HASH = "a7fdc2c725f22745b6789f6033edac3beb27f11f6e2b253c2af5417d6c0f543aa97bcb0642b3fb4fc857cae01fbc0fd182bf382e92690537d3b348e625d9f5ac"

RPROVIDES:${PN} += "libspdylay.so.7 \
libspdylay7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
