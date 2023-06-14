SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "9149ce48e977b4d7f1d298e00ed7ba85c3b0ffc7486440b97587e901af6745f66289ef56eefeb2a78848a3604a14d78dfd6d34f21967edc45d72a49a493e78b4"

RPROVIDES:${PN} += "libOgreMain.so.13.5 \
libOgreMain13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
