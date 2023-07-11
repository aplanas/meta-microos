SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "e1c26f558b1a545532f589095d1b3a842bf81fbf0f13e9cee1a33ba4ed5049771e1f7cb670c3c9fda632df86af566db74f99df3613e023903b721c3c868c58a0"

RPROVIDES:${PN} += "libOgreMain.so.13.5 \
libOgreMain13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
