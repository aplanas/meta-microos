SUMMARY = "Development headers for Mesh LOD"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "1040aaf0c8736b68cbe4b7f5885c99ee25d79948baf6ca7b9e151b8eccbc16af429747a84cef4b876110a118c92b3446b78086a121c51132dbb1400b9f90d6c9"

RPROVIDES:${PN} += "libOgreMeshLodGenerator-devel \
libOgreMeshLodGenerator-devel(aarch-64) \
pkgconfig(OGRE-MeshLodGenerator)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMeshLodGenerator13_5 \
pkgconfig(OGRE)"

inherit rpm
