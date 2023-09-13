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

RPM_NAME = "ogre-demos-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "5c2f6d62dcfce20d740d042da413df7a79b3240dbea6f433f9526df0fbd9f31428a06307ec1d967f1ac34b1025a47a0ff8f8caaf62a1cdbe4f721cc8f4e9f03f"

RPROVIDES:${PN} += "ogre-demos-devel"

RDEPENDS:${PN} += "libOgreRTShaderSystem-devel \
libOgreTerrain-devel"

inherit rpm
