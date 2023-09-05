SUMMARY = "X11 DRI3 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-dri3-0-1.16-1.1.aarch64.rpm"
RPM_HASH = "5d98f8b0410957879855eed1c3527dbdd42d13c48295105b55b5a982ab7207867cf529c3cd3291fd618c5004f934e84945d92b376a519a6d99f1db77760adb56"

RPROVIDES:${PN} += "libxcb-dri3-0 \
libxcb-dri3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
