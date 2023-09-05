SUMMARY = "X11 XInput Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinput is an extension to the X Window System intended to replace \
core input processing."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-xinput0-1.16-1.1.aarch64.rpm"
RPM_HASH = "0cf5e54e9a98bc034dd572fa3d7def2627b38a81a6f6c17e683418b070eebfafa7c74713651639117699cfe92938c30dfa3ed36ffd5b2bb8a6db57e398b018bc"

RPROVIDES:${PN} += "libxcb-xinput.so.0 \
libxcb-xinput0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
