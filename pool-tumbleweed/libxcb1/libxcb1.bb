SUMMARY = "X11 core protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb1-1.16-1.1.aarch64.rpm"
RPM_HASH = "42e84d58c148b0762ca7f8682185e1173c735dea072d551813f94a428c02c223727a809a25377b621ebd5b06d3729b9022ab4fe8c5b5c3a4373fb5441e38c5da"

RPROVIDES:${PN} += "libxcb.so.1 \
libxcb1 \
xorg-x11-libxcb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6"

inherit rpm
