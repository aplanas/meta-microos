SUMMARY = "Development headers for Mesh LOD"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "90536621dcea82f70e6de25da153f49f6728f6c738bd718f61e6a454d1d4169e9e52b34cd8a4d6418baf02d4b154b1fa236f64e7166345eb31788a7e0dfa0dd3"

RPROVIDES:${PN} += "libOgreMeshLodGenerator-devel \
pkgconfig-OGRE-MeshLodGenerator"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMeshLodGenerator13-5 \
pkgconfig-OGRE"

inherit rpm
