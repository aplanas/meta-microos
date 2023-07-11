SUMMARY = "Development files for libwebsockets"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the WebSockets library."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "libwebsockets-devel-4.3.2-3.2.aarch64.rpm"
RPM_HASH = "f7059472d238a5cfee896e33704e1d043d1d73d0c94e7397c4b1bc3bf9f2ee063d7ebbcde8cc5a0d676e02da14c6e95af2d137b52b5bfa50ab6dfcd682fd27ec"

RPROVIDES:${PN} += "cmake-libwebsockets \
libwebsockets-devel \
libwebsockets-evlib-uv.so \
pkgconfig-libwebsockets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
libwebsockets.so.19 \
libwebsockets19 \
openssl-devel"

inherit rpm
