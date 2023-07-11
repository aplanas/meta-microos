SUMMARY = "Documentation for the Ogre 3D engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains the documentation for OGRE."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-docs-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "b093944c09d01ea55f6278a54c8c069c30c80cca040531b1f7aa7fc41e5285936274cd6c63b92ee1047ce5930302b53e1012140dd1722eda23fa2bf30a60770a"

RPROVIDES:${PN} += "ogre-docs"

RDEPENDS:${PN} += ""

inherit rpm
