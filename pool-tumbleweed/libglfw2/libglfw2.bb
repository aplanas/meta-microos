SUMMARY = "Portable framework for OpenGL application development"
DESCRIPTION = "GLFW is a free, Open Source, portable framework for OpenGL application \
development. In short, it is a single library providing a powerful, \
portable API for otherwise operating system specific tasks such as opening \
an OpenGL window, and reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "libglfw2-2.7.6-1.27.aarch64.rpm"
RPM_HASH = "957ce47c31acf94600af9289578010203f615b8b83cda16ed983f9f8cfd4af7d42e4d2cf505beaa5b00610148684303a48e1dab144d423804f6bb446aa56fb61"

RPROVIDES:${PN} += "libglfw.so.2 \
libglfw2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
