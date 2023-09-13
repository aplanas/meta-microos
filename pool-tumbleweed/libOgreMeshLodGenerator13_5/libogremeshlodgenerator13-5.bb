SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMeshLodGenerator13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "5a340791f6ad74af3b442c4c3d0d8784115a72d22ccfb69f31037451fc08144895e473bec6786cc88a6efce98e35f82d3126248a06189568f2852ce1f1989296"

RPROVIDES:${PN} += "libOgreMeshLodGenerator.so.13.5 \
libOgreMeshLodGenerator13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
