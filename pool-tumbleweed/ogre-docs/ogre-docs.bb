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

RPM_NAME = "ogre-docs-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "1e1a3cf7ec53dd0fa0b5021a53c2def2635ba66818167e49152fad0eca3eb2e75e5a68e1dfe5663206baa7eb8cb1b5808de9a66280294a2fe9857b41bdaa9de6"

RPROVIDES:${PN} += "ogre-docs"

RDEPENDS:${PN} += ""

inherit rpm
