SUMMARY = "Shared library for nghttp2"
DESCRIPTION = "Shared C libraries for implementation of Hypertext Transfer Protocol \
version 2."
LICENSE = "MIT"

PV = "1.55.1"

RPM_NAME = "libnghttp2-14-1.55.1-1.1.aarch64.rpm"
RPM_HASH = "f92f2aa5ec0596399be6785c56cefa76b48aecade9ffe7d5a453e1e271a8c1a35fae14394b6c6dd272d39ff1b690affe3dd725419ac14da2bb442860625a6cbd"

RPROVIDES:${PN} += "libnghttp2-14 \
libnghttp2.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
