SUMMARY = "Framework for OpenGL application development"
DESCRIPTION = "GLFW is a framework for OpenGL application development. It is a \
single library providing a powerful, portable API for otherwise \
operating system specific tasks such as opening an OpenGL window, and \
reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "3.3.8"

RPM_NAME = "libglfw3-3.3.8-2.1.aarch64.rpm"
RPM_HASH = "b00466f7d917dedf26b55a277dc487fa341f64eb48e0af1e37648631770d7866574cdb2a9f2b130b71c8fd555dfd62b6f1f98847f63d8ad4f7d987e6eec98ad2"

RPROVIDES:${PN} += "libglfw.so.3 \
libglfw3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
