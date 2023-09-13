SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgrePaging13_5-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "9000a1ba30e980a997e09c0ff63b98f8bae0e4dd95ea2e07cc6d26ae1d1fdd23aac86e4f74d0c8acb53c6376d8f11a017b632af706247c0031a33999835a3beb"

RPROVIDES:${PN} += "libOgrePaging.so.13.5 \
libOgrePaging13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
