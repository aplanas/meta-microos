SUMMARY = "Development files for nghttp2"
DESCRIPTION = "Development files for usage with libnghttp2, which implements \
Hypertext Transfer Protocol version 2."
LICENSE = "MIT"

PV = "1.54.0"

RPM_NAME = "libnghttp2-devel-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "ebdc20be035792112674b9581a5485476ad2d0e227fecef9576bf2e3677cee4660a5770d9e12a46487ec919c92cdeb4bb8a0d1c047431e1286134d63a9290c6e"

RPROVIDES:${PN} += "libnghttp2-devel \
nghttp2-devel \
pkgconfig-libnghttp2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnghttp2-14"

inherit rpm
