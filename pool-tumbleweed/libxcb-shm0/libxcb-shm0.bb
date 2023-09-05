SUMMARY = "X11 Shared Memory Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The MIT Shared Memory (MIT-SHM) Extension allows exchanging image \
data between client and server using shared memory, so that it does \
not need to be transferred over sockets."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-shm0-1.16-1.1.aarch64.rpm"
RPM_HASH = "d733413c0f2260cfd65135e6cbc8561a77ecc40ad9a10d5884f69efa6dbc1bb031adaa297e63387fd4aee798bf7183fafdb34bdc715ab86aa4efb901db51df12"

RPROVIDES:${PN} += "libxcb-shm.so.0 \
libxcb-shm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
