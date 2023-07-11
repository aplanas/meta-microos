SUMMARY = "X11 XInput Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinput is an extension to the X Window System intended to replace \
core input processing."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xinput0-1.15-2.3.aarch64.rpm"
RPM_HASH = "f807849df19be96eb74c9735a63a8495ffb915ae637d7e4ecea5184dd63d1fdc8d8601bb3aeee323a7f14756aa468659e124650946430dd79d685a5f0ab93712"

RPROVIDES:${PN} += "libxcb-xinput.so.0 \
libxcb-xinput0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
