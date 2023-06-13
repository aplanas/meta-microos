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

PV = "1.15"

RPM_NAME = "libxcb-composite0-1.15-2.2.aarch64.rpm"
RPM_HASH = "2442caaf53ac64dc957e5f4df70f63ff10d621e110808d50627f0f04b4135040fca34bb7173777c188c3952f149f4b7d750a9e6dfe7d836070236a2ec64932a6"

RPROVIDES:${PN} += "libxcb-composite.so.0()(64bit) \
libxcb-composite0 \
libxcb-composite0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
