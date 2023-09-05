SUMMARY = "X11 Composite Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The Composite extension causes a entire sub-tree of the window \
hierarchy to be rendered to an off-screen buffer. Applications can \
then take the contents of that buffer and do whatever they like. The \
off-screen buffer can be automatically merged into the parent window \
or merged by external programs, called compositing managers."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-composite0-1.16-1.1.aarch64.rpm"
RPM_HASH = "f3a18110a0352ec061cd3a95927c028b8e427a7fb7d26969d6c4d06677e2ac78b5e1fc0c588b50880c2c6686d038e1f98a478d4dbf703ddc77709e1bfc66c764"

RPROVIDES:${PN} += "libxcb-composite.so.0 \
libxcb-composite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
