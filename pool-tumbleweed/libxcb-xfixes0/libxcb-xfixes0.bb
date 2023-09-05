SUMMARY = "X11 Xfixes Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Fixes extension provides applications with work-arounds for \
various limitations in the core protocol."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-xfixes0-1.16-1.1.aarch64.rpm"
RPM_HASH = "21bdfb3984e19ebd87c72c9929075d7fc564a699dd2c15fbcc5377f2f980b23b55cec9daace2c0ee28de53017fdf069e066a8ccd26fb62981b3cddc7cb3c7128"

RPROVIDES:${PN} += "libxcb-xfixes.so.0 \
libxcb-xfixes0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
