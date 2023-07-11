SUMMARY = "The EGLStream-based Wayland external platform"
DESCRIPTION = "This is an implementation of a EGL External Platform library to add client-side \
Wayland support to EGL on top of EGLDevice and EGLStream families of extensions. \
 \
This library implements an EGL External Platform interface to work along with \
EGL drivers that support the external platform mechanism."
LICENSE = "MIT"

PV = "1.1.12"

RPM_NAME = "libnvidia-egl-wayland1-1.1.12-1.1.aarch64.rpm"
RPM_HASH = "aad285ecc1492fbcbaabccb52b673d2000472035d9c76e8c6960315d64c5ee7034804356c867decf6282cac29874b9e430f6d5462dbf5d4c4fe39d5d444645d1"

RPROVIDES:${PN} += "libnvidia-egl-wayland.so.1 \
libnvidia-egl-wayland1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
