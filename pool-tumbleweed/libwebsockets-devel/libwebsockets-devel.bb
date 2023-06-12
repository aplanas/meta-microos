SUMMARY = "Development files for libwebsockets"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the WebSockets library."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "libwebsockets-devel-4.3.2-3.1.aarch64.rpm"
RPM_HASH = "5ef6cb1fa6e4c21ddf53956f36f6fd1609ce17a48b3b2e4806a15f40b3b30b903d64bbe36775847bc55d6c22b6a3492df776c2114eca191a2d83f2075bf39f24"

RPROVIDES:${PN} += "cmake(libwebsockets) \
libwebsockets-devel \
libwebsockets-devel(aarch-64) \
libwebsockets-evlib_uv.so()(64bit) \
pkgconfig(libwebsockets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libuv.so.1()(64bit) \
libwebsockets.so.19()(64bit) \
libwebsockets19 \
openssl-devel"

inherit rpm
