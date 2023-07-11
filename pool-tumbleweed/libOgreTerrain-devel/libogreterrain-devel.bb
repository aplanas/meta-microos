SUMMARY = "Development files for the Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Ogre Terrain System."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreTerrain-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "4fac9fc9d0f69933038b97e4a676125d6e1a009aa0e7e230383d466b232a855328004a72e105349ae5df406b20d9d277be41a8f7b9a36137463312a747820c73"

RPROVIDES:${PN} += "libOgreTerrain-devel \
pkgconfig-OGRE-Terrain"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreTerrain13-5 \
pkgconfig-OGRE \
pkgconfig-OGRE-Paging"

inherit rpm
