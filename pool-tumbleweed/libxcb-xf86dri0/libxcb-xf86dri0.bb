SUMMARY = "X11 XFree86-DRI Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-xf86dri0-1.16-1.1.aarch64.rpm"
RPM_HASH = "e4300248e9a833b0865129d404f7a8e79553b45d29106a9009f4b070ad8ed14deb921a6b59f29430a0ea3e65c29e5c7305ea4f46819331c5bf4396fca770cc35"

RPROVIDES:${PN} += "libxcb-xf86dri.so.0 \
libxcb-xf86dri0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
