SUMMARY = "The EGLStream-based Wayland external platform"
DESCRIPTION = "This is an implementation of a EGL External Platform library to add client-side \
Wayland support to EGL on top of EGLDevice and EGLStream families of extensions. \
 \
This library implements an EGL External Platform interface to work along with \
EGL drivers that support the external platform mechanism."
LICENSE = "MIT"

PV = "1.1.11"

RPM_NAME = "libnvidia-egl-wayland1-1.1.11-1.2.aarch64.rpm"
RPM_HASH = "f789833322cab1db3789da6d4c3df7e59f4bffb0b5d3c5485ae21efb89479120e0c8d29e0c72696966793c436ce47336553cabd3d56271e9ef67b2a4e6090afa"

RPROVIDES:${PN} += "libnvidia-egl-wayland.so.1()(64bit) \
libnvidia-egl-wayland1 \
libnvidia-egl-wayland1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
