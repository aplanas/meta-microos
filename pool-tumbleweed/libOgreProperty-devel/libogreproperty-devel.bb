SUMMARY = "Development files for the Ogre Property component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the property component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "d0123a4a914035bd5516c48f70caf3a2a77e6e4eddd46ba2950b224fab63190677597b254d4bde75f75af5d7e71473464c5a89c4bfae50e1c5f96034fe297176"

RPROVIDES:${PN} += "libOgreProperty-devel \
pkgconfig-OGRE-Property"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreProperty13-5 \
pkgconfig-OGRE"

inherit rpm
