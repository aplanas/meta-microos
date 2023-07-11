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

RPM_NAME = "libxcb-shm0-1.15-2.3.aarch64.rpm"
RPM_HASH = "08961c8cf8268d83cb2496cbac6d0169eac4dd40a4156b330b05216f7fbd728a8610397464a5996c0257064cc647a5b086798d3cb8f4eaf8b444fec679bdbab3"

RPROVIDES:${PN} += "libxcb-shm.so.0 \
libxcb-shm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
