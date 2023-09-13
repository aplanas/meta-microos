SUMMARY = "Development files for the Ogre Engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "ogre-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "9c8df8051dc7c19ce0f1716b8fda30cfecb6b668f74ba1b48601b613709174371e134e0d32cd5f7dc746bf16e4affc98532566a7a1131515226b8f56f753a337"

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
