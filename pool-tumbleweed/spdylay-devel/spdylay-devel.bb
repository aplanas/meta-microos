SUMMARY = "Development files for the SPDY C Library"
DESCRIPTION = "This is an experimental implementation of Google’s SPDY protocol in \
C. This library provides SPDY version 2, 3 and 3.1 framing layer \
implementation. It does not perform any I/O operations but uses \
callback functions provided by the application. Likewise, it includes \
no event polling mechanism, so the application can freely choose. \
There is no dependency on a particular SSL library. \
 \
This package holds the development files."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "spdylay-devel-1.4.0-3.27.aarch64.rpm"
RPM_HASH = "51a478edb2929e1a8c7ee9336d8111fa7b94fefbaf2ab962c844c639dd685ab66a7c244eee758dff11c96b3d632dca11eda0d2abdbd9fa6c8e494ca3ad1034e5"

RPROVIDES:${PN} += "pkgconfig-libspdylay \
spdylay-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspdylay7 \
pkgconfig-zlib"

inherit rpm
