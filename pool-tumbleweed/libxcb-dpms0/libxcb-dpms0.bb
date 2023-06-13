SUMMARY = "X11 DPMS Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dpms0-1.15-2.2.aarch64.rpm"
RPM_HASH = "745953f6e56071a78f67c453ca97e37ae4cede683a70b5262c3472cc02ecea51bfc7d66b83946de99f0c32b9dd1364b45476b1c33c836ff77601a78046fa8921"

RPROVIDES:${PN} += "libxcb-dpms.so.0()(64bit) \
libxcb-dpms0 \
libxcb-dpms0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
