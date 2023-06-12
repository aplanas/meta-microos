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

RPM_NAME = "ogre-demos-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "6d4391152b3543c1f259b321ec8cf858ac416734e14968191cb699745fbf9ab20e36a2acd2b0d85b5bf1e388f6a575de4af096a5c78f30f78506eaef623b894e"

RPROVIDES:${PN} += "ogre-demos-devel \
ogre-demos-devel(aarch-64)"
RDEPENDS:${PN} += "libOgreRTShaderSystem-devel \
libOgreTerrain-devel"

inherit rpm
