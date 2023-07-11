SUMMARY = "Portable framework for OpenGL application development"
DESCRIPTION = "GLFW is a free, Open Source, portable framework for OpenGL application \
development. In short, it is a single library providing a powerful, \
portable API for otherwise operating system specific tasks such as opening \
an OpenGL window, and reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "libglfw2-2.7.6-1.28.aarch64.rpm"
RPM_HASH = "063d5d3bfe579dbcc1186985747f361f5c1a4328fc1cd6b14be2f3c109813d5a270a031420c379cf784ba3db012569b757bd8820c16cda9fed6b2f5ae6b8fea2"

RPROVIDES:${PN} += "libglfw.so.2 \
libglfw2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6"

inherit rpm
