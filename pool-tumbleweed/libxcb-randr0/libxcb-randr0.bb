SUMMARY = "X11 RandR Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-randr0-1.15-2.3.aarch64.rpm"
RPM_HASH = "b7ee1e3efc165dd62158fb329af490a498f74dd26150f7bfa9c27389198fea31eb8174ef87daa64ccb9eb5b5aa4bad0154f166966da965419105ea026bd30419"

RPROVIDES:${PN} += "libxcb-randr.so.0 \
libxcb-randr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
