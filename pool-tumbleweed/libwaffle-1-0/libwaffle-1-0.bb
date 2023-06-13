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

RPM_NAME = "libwaffle-1-0-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "f58b55bc7fd32fdc2fa8b02705fa645837ffb1aa3817c5c3368ff61c0d3760825f8a7870cb08308bc69e79e5106d9789e906d74efd6ed9b7372a05d9527b4aa6"

RPROVIDES:${PN} += "libwaffle-1-0 \
libwaffle-1-0(aarch-64) \
libwaffle-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcb.so.1()(64bit) \
waffle"

inherit rpm
