SUMMARY = "Development headers for rapid prototyping"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "bca5b4b2eb3b5ac633e093b0f8f20289f90ba0410f41515b3ba1388eb5db31d70ea8edeeb3990fb4264ac4a95b17704d7ade1523cf179f2c9dca0d9431353901"

RPROVIDES:${PN} += "libOgreBites-devel \
libOgreBites-devel(aarch-64) \
pkgconfig(OGRE-Bites)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreBites13_5 \
libOgreBitesQt13_5 \
pkgconfig(OGRE) \
pkgconfig(sdl2)"

inherit rpm
