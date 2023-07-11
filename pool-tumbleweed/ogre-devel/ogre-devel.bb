SUMMARY = "Development files for the Ogre Engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "89441f63e667261040dbe934c96639d77d5538be686c25b9cf5c2344ae93fe876b30b8620019686a6dac845e1a99cddc4bd14c56ff4992b0a838eea54fe7d5a6"

RPROVIDES:${PN} += "ogre-devel"

RDEPENDS:${PN} += "pkgconfig-OGRE \
pkgconfig-OGRE-Bites \
pkgconfig-OGRE-MeshLodGenerator \
pkgconfig-OGRE-Overlay \
pkgconfig-OGRE-Paging \
pkgconfig-OGRE-Property \
pkgconfig-OGRE-RTShaderSystem \
pkgconfig-OGRE-Terrain \
pkgconfig-OGRE-Volume"

inherit rpm
