SUMMARY = "X11 Shared Memory Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The MIT Shared Memory (MIT-SHM) Extension allows exchanging image \
data between client and server using shared memory, so that it does \
not need to be transferred over sockets."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-shm0-1.15-2.2.aarch64.rpm"
RPM_HASH = "afb9a8243d8c3b17c464d2e065d5ac3f8d49700de648a8522b60458e3129043de80eb9f47b34d8fbf0062a6f4de17710a49c5dc7f4fff7acb974fa71935f6287"

RPROVIDES:${PN} += "libxcb-shm.so.0()(64bit) \
libxcb-shm0 \
libxcb-shm0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
