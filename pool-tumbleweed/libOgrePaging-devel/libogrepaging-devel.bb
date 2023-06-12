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

RPM_NAME = "libOgrePaging-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "10531bb52974bad7ffd43b6a367963b8be145bd938abeed93849b65543dba01377861c4d8b98c2701350c73b7235fb0939f13affed8cac383e9e7933827c4e75"

RPROVIDES:${PN} += "libOgrePaging-devel \
libOgrePaging-devel(aarch-64) \
pkgconfig(OGRE-Paging)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgrePaging13_5 \
pkgconfig(OGRE)"

inherit rpm
