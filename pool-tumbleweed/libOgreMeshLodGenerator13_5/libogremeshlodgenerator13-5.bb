SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "2dcc6e56e8a841fce13f31613de42bc20c8b8810bd0bc590aa407392e749bcc8bee96120d7d4bf879b63df78b56cd57294fcdebaf61bd2ae6d31e6518e07bb86"

RPROVIDES:${PN} += "libOgreMeshLodGenerator.so.13.5 \
libOgreMeshLodGenerator13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
