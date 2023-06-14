SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "a966a5324f7b39b9da97043878af2100b55e38804d4b5e56b4e50f893b46c3ce1e19c4243991c1970861cbd1c10ba4d8e7ea8d7c7bb8f2f031a68da02bf23df7"

RPROVIDES:${PN} += "libOgreMeshLodGenerator.so.13.5 \
libOgreMeshLodGenerator13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
