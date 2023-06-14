SUMMARY = "X11 XInput Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinput is an extension to the X Window System intended to replace \
core input processing."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xinput0-1.15-2.2.aarch64.rpm"
RPM_HASH = "83e0c745b304c3d0b89ddd11393984db0f9c8069492e67acbd8c12f0ea4ac7c71ecc7cb8bffaa5c275e3f943c39504c025fc1b85784b55f9de8772a1176ba946"

RPROVIDES:${PN} += "libxcb-xinput.so.0 \
libxcb-xinput0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
