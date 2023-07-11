SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgrePaging13_5-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "633fe85050125243109a2638c4d0ce3c9dfbac4dc758671106a874f0146e2b4f95dc3f8bf5dc0bb90d099ada00faa49341ced28d2d1fbdee74c4825a64afb02b"

RPROVIDES:${PN} += "libOgrePaging.so.13.5 \
libOgrePaging13-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
