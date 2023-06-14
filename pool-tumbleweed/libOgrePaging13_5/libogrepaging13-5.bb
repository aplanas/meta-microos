SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgrePaging13_5-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "832cc42913ca30b859c8ebf5512e9606acf0dbf7130c9b921a286fa232be42cad30aef8441c079f110bcb35a6366f36468c0d2e7c346e1ac5c00ae631e1b4ceb"

RPROVIDES:${PN} += "libOgrePaging.so.13.5 \
libOgrePaging13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
