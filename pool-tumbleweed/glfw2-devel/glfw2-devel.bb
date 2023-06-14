SUMMARY = "Portable framework for OpenGL application development"
DESCRIPTION = "GLFW is a free, Open Source, portable framework for OpenGL application \
development. In short, it is a single library providing a powerful, \
portable API for otherwise operating system specific tasks such as opening \
an OpenGL window, and reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "glfw2-devel-2.7.6-1.27.aarch64.rpm"
RPM_HASH = "866d3902207bfc993e27989f59e49167edf9d37fd3128ddd20f8800bb90ab7443282ce520912083569c4fe47d5618a2de7c0676f783e01e0d2488249807c564d"

RPROVIDES:${PN} += "glfw2-devel \
pkgconfig-libglfw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglfw2 \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xrandr"

inherit rpm
