SUMMARY = "Portable framework for OpenGL application development"
DESCRIPTION = "GLFW is a free, Open Source, portable framework for OpenGL application \
development. In short, it is a single library providing a powerful, \
portable API for otherwise operating system specific tasks such as opening \
an OpenGL window, and reading keyboard, time, mouse and joystick input."
LICENSE = "Zlib"

PV = "2.7.6"

RPM_NAME = "glfw2-devel-2.7.6-1.28.aarch64.rpm"
RPM_HASH = "34ad0f2d01c5aae318302db90fc40aac6ab61d0ddccb5e4f9335bb765700335cbc62f3e9ba278de8734c3fc9e5446c69b627755428c445aeb812e695e30dacb3"

RPROVIDES:${PN} += "glfw2-devel \
pkgconfig-libglfw"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglfw2 \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xrandr"

inherit rpm
