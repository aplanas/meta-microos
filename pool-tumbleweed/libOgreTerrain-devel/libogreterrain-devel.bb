SUMMARY = "Development files for the Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Ogre Terrain System."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreTerrain-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "222134bb50c950da2e6412635102efa58e9c47999ff1c0070f3c113a09caa68858121e759780ae69de39f696150d18efa4413e320706aa154d68ff05311d762c"

RPROVIDES:${PN} += "libOgreTerrain-devel \
pkgconfig-OGRE-Terrain"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreTerrain13-5 \
pkgconfig-OGRE \
pkgconfig-OGRE-Paging"

inherit rpm
