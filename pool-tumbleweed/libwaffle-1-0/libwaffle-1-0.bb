SUMMARY = "C library defering selection of GL API and window system until runtime"
DESCRIPTION = "Waffle is a C library that allows deferring the selection of GL API \
and window system until runtime. For example, on Linux, Waffle enables \
an application to select X11/EGL with an OpenGL 3.3 core profile, Wayland \
with OpenGL ES2, and other window system / API combinations. \
 \
Waffle's immediate goal is to enable Piglit, Mesa's OpenGL test suite, to test \
multiple GL flavors."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "libwaffle-1-0-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "1fec34725e6930aee251d3e12f79be99dafb97e0b7180af56f499b6a66b45cd6166f4effa4bce884e37ccb1b53d1cd86b3b249c0033791598e4aea2b3fdf22f6"

RPROVIDES:${PN} += "libwaffle-1-0 \
libwaffle-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libudev.so.1 \
libxcb.so.1 \
waffle"

inherit rpm
