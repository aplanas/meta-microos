SUMMARY = "Shared library for nghttp2"
DESCRIPTION = "Shared C libraries for implementation of Hypertext Transfer Protocol \
version 2."
LICENSE = "MIT"

PV = "1.54.0"

RPM_NAME = "libnghttp2-14-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "79ec8be141481c0ed6de1dfb1682903546c01a9848a0b23984f7a10d7ff9f95028febbb07af1a4ea6c7c68bf595edc0c354e9654cff087116497b127fb33c5e4"

RPROVIDES:${PN} += "libnghttp2-14 \
libnghttp2.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
