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

RPM_NAME = "libspdylay7-1.4.0-3.26.aarch64.rpm"
RPM_HASH = "2f874be8caa2aa67aea6594937b771d71fda6aed47184069d1e0502b5af68c3ce9b72e333e5352316fd9fb7c64554f5542ac13a7c50e867d9fa8fd1b9b1d6978"

RPROVIDES:${PN} += "libspdylay.so.7()(64bit) \
libspdylay7 \
libspdylay7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
