SUMMARY = "Additional utilities for working with the Ogre 3D engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains various tools that make working with ogre easier."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-tools-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "577de4f36f36ef2cbcd60746c1083009dda4a2173424f430aa9a04a933e172f8cf498f0be610fbc61cf50d83cd7b2da9d75768c1738820ff038b84df429de4eb"

RPROVIDES:${PN} += "ogre-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libOgreMeshLodGenerator.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
