SUMMARY = "Shared library for nghttp2"
DESCRIPTION = "Shared C libraries for implementation of Hypertext Transfer Protocol \
version 2."
LICENSE = "MIT"

PV = "1.53.0"

RPM_NAME = "libnghttp2-14-1.53.0-1.1.aarch64.rpm"
RPM_HASH = "5c04c2771d997e99e469a26bb8405f3d6bd0a000cb3281b98f86c81f517226ce65f3ea128a453b572988c3a474fccc82ee1eba5aba784b1f252b785be5f548b4"

RPROVIDES:${PN} += "libnghttp2-14 \
libnghttp2-14(aarch-64) \
libnghttp2.so.14()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
