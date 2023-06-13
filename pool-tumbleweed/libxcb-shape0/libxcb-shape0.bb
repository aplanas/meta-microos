SUMMARY = "X11 Shape Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
- X11 Nonrectangular Window Shape extension (Xshape)"
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-shape0-1.15-2.2.aarch64.rpm"
RPM_HASH = "6085e77b0a1ab7fe139b3ac1708c84d2ff824285257260afe5d1dd816fb2f5b52ebfe53b05bb471631e038e6a8a2e0e6e933a9cc5b93c6eff13360ae2f7671dd"

RPROVIDES:${PN} += "libxcb-shape.so.0()(64bit) \
libxcb-shape0 \
libxcb-shape0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
