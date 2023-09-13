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

RPM_NAME = "libOgrePaging-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "8b29772e2bfce1d1581e778865950ee5ff53e141b7616ee57268f75ef85c26ee6a0a6f6299f1f6831e17aea2e0921300e047693b755f0e94d7e8584923f07b1a"

RPROVIDES:${PN} += "libOgrePaging-devel \
pkgconfig-OGRE-Paging"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgrePaging13-5 \
pkgconfig-OGRE"

inherit rpm
