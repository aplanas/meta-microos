SUMMARY = "X11 Xinerama Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xinerama0-1.15-2.3.aarch64.rpm"
RPM_HASH = "502beca11eea9e1310b5c5d1d2d2804b4b286b88c01111dff0378552bff3758906093f441ffc606be124957451c9e6e2bdf4cb16226bf662125300455204ffd8"

RPROVIDES:${PN} += "libxcb-xinerama.so.0 \
libxcb-xinerama0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
