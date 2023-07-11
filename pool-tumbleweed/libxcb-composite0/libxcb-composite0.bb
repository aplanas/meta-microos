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

RPM_NAME = "libxcb-composite0-1.15-2.3.aarch64.rpm"
RPM_HASH = "a64d66f2783e825a7635350f6b4b364c2fd75a9c16fc0e82e9d373570793f2207978c73c5bb1c18a038649beb605adf4432ea6f47febbdeb6d6987912dcd5f11"

RPROVIDES:${PN} += "libxcb-composite.so.0 \
libxcb-composite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
