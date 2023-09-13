SUMMARY = "Development headers for rapid prototyping"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "990487fd9bdd71ce2d5e9d156c516f12dc172dc274d6b28099e8758779c0f4932c9c7f90d8645e37dee65da773f470e88c58d0352b4037389825a447257e114f"

RPROVIDES:${PN} += "libOgreBites-devel \
pkgconfig-OGRE-Bites"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreBites13-5 \
libOgreBitesQt13-5 \
pkgconfig-OGRE \
pkgconfig-sdl2"

inherit rpm
