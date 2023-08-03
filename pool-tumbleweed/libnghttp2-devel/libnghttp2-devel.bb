SUMMARY = "Development files for nghttp2"
DESCRIPTION = "Development files for usage with libnghttp2, which implements \
Hypertext Transfer Protocol version 2."
LICENSE = "MIT"

PV = "1.55.1"

RPM_NAME = "libnghttp2-devel-1.55.1-1.1.aarch64.rpm"
RPM_HASH = "19e17bb601d6d9f03ce4db856a99d9a42ce8c6ff2e8f5c92d43097ef29c833059b497ca19e1c538240ca91da5de74d1bf3b1c2bc5780f9e6d0628ce4c1655daa"

RPROVIDES:${PN} += "libnghttp2-devel \
nghttp2-devel \
pkgconfig-libnghttp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnghttp2-14"

inherit rpm
