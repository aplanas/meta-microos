SUMMARY = "Development headers for the Ogre Paging Scene Manager component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
The Paging Scene Manager allows scenes to be split into a set of pages. Only \
those pages that are being used need be loaded at any given time, allowing \
arbitrarily large scenes. Each page has its own heightmap, to which several \
textures can be applied by height. \
 \
This package contains the development headers for the Paging Scene Manager \
component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgrePaging-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "1c001aecfd6a115b8d1623078c9229197eabd91428a7d3492e91431cfe08860511b247d6ae0a83c8aae1cf42b7ec44b90dea3074971e3e960d981063e861cd6e"

RPROVIDES:${PN} += "libOgrePaging-devel \
pkgconfig-OGRE-Paging"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgrePaging13-5 \
pkgconfig-OGRE"

inherit rpm
