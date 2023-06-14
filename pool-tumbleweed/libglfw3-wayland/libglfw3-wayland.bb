SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw3-wayland-3.3.8-2.1.aarch64.rpm"
RPM_HASH = "626f0bba2e01afe8040a2809d8da472973eacb8b526e9cbea57fe1723bba6c2da1bbf304ec3574ea6d950bc66c5a95173721fd996ef208ee41d11616720f3ed3"

RPROVIDES:${PN} += "libglfw.so.3 \
libglfw3 \
libglfw3-wayland"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwayland-client.so.0"

inherit rpm
