SUMMARY = "X11 Xfixes Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xfixes0-1.15-2.3.aarch64.rpm"
RPM_HASH = "5baa648a5cb0b6465d7ae31332dfd006c37ad21e2d0882dc4c62e0f95087ea1d5477c4ad5df5c303c1a915fd61ec613fc1d95e913ac703cea46a803ca68478e6"

RPROVIDES:${PN} += "libxcb-xfixes.so.0 \
libxcb-xfixes0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
