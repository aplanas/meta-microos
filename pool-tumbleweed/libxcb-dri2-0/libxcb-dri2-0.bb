SUMMARY = "X11 DRI2 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dri2-0-1.15-2.3.aarch64.rpm"
RPM_HASH = "2b8320f8bc2b478a5322047749fd99fdd7ea895dafc5e294e03de1ac535e6dabafccf3cd7e4a809392971cb75718eacc3b8edc780cc1263b9547d643d85c4623"

RPROVIDES:${PN} += "libxcb-dri2-0 \
libxcb-dri2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
