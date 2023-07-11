SUMMARY = "Sources for the Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains the source of the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-demos-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "487b1e49eb9b59ea500c10070956138db5448cbd553aab737343bc5d9abd9c3f766ea06e7ff4755bf0bfd64322c099fc122139f0736bc1c65689a9d0d26dc2ee"

RPROVIDES:${PN} += "ogre-demos-devel"

RDEPENDS:${PN} += "libOgreRTShaderSystem-devel \
libOgreTerrain-devel"

inherit rpm
