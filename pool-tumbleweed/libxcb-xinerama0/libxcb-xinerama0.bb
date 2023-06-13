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

RPM_NAME = "libxcb-xinerama0-1.15-2.2.aarch64.rpm"
RPM_HASH = "442288902795df1a47f1a5214bd41f2aaa2841e22b9b29887f8221a34562765b687d1e6993aae18801902867f2ec6c0f39b07ce8402a03c93a7dfeee825683ca"

RPROVIDES:${PN} += "libxcb-xinerama.so.0()(64bit) \
libxcb-xinerama0 \
libxcb-xinerama0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
