SUMMARY = "Development headers for rapid prototyping"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreBites-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "a15cfee9c30edaff7baba104037e5774a9c50ab502d620e7902e95125a76ad4f7ed941867b5ea2b2bf35d41d12de06cf1a5743c4b3f5c7d1716e92214d936e5c"

RPROVIDES:${PN} += "libOgreBites-devel \
pkgconfig-OGRE-Bites"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreBites13-5 \
libOgreBitesQt13-5 \
pkgconfig-OGRE \
pkgconfig-sdl2"

inherit rpm
