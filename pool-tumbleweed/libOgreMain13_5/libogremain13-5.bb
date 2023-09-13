SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "ab159bd5ef96fd1a9c863a7136aaa462b0303256be0305baff8b12ba94e74c8b93c78b8ce35bb44430feb5decaab5da298266104f7de17f43fc9dfeba9a844b2"

RPROVIDES:${PN} += "libOgreMain.so.13.5 \
libOgreMain13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
