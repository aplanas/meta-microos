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

RPM_NAME = "waffle-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "7bb8c496b850f83012e9c07ab0dfcf16111c91cbf366db9da94225dbfa5728c885512d5a94147b410522c7bca7209712233e463f61ccd2f444b2766173081357"

RPROVIDES:${PN} += "waffle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwaffle-1.so.0"

inherit rpm
