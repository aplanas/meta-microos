SUMMARY = "X11 Damage Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-damage0-1.15-2.2.aarch64.rpm"
RPM_HASH = "daa2e37ee6b01083d0c2d785c15bcd0a019ac220e33f554214cb5e1864f303ec85f90c0ce77ffe18dc256c5bc7bb82639d8794a7fa62135abfe502518adcc372"

RPROVIDES:${PN} += "libxcb-damage.so.0()(64bit) \
libxcb-damage0 \
libxcb-damage0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
