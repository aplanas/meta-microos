SUMMARY = "Development headers for Mesh LOD"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "6be726fe8f12efd4eb936839a135b7a866000ea2cd827022dcaac3fa4043747e02116a50834bda6c0243c78946c051e0cedb50b93806aa1ec9f68235bdcee413"

RPROVIDES:${PN} += "libOgreMeshLodGenerator-devel \
pkgconfig-OGRE-MeshLodGenerator"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMeshLodGenerator13-5 \
pkgconfig-OGRE"

inherit rpm
