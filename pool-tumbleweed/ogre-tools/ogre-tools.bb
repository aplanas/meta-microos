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

RPM_NAME = "ogre-tools-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "c451e3e7b4ddcfa7248ce18cc55e8c192ca555d54d21aa76fc2f8643c0cb0cbacb6525dd2cefbd2ae29357c841a2d8c530203ff5051149f278f658dae3576757"

RPROVIDES:${PN} += "ogre-tools \
ogre-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libOgreMain.so.13.5()(64bit) \
libOgreMeshLodGenerator.so.13.5()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
