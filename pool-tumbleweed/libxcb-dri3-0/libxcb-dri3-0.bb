SUMMARY = "X11 DRI3 Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-dri3-0-1.15-2.2.aarch64.rpm"
RPM_HASH = "1091601f28a3f3d9d9f4174df3c372d6c3d1ea0e8982695e280d6a8ada937ff57563031e21a59584e1b6971234c9f6df6831df70b5da98367aa49f1a2ff1dbf3"

RPROVIDES:${PN} += "libxcb-dri3-0 \
libxcb-dri3-0(aarch-64) \
libxcb-dri3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
