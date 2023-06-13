SUMMARY = "Development files for the Ogre Property component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the property component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "86505a11e9ae89390bcdd71e6d3189d7999fb65ab51781b82ddd33c197b199c2e86927aec8230e914f918a5fe74ba6d842193e432df360a00f9d3a5279281103"

RPROVIDES:${PN} += "libOgreProperty-devel \
libOgreProperty-devel(aarch-64) \
pkgconfig(OGRE-Property)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreProperty13_5 \
pkgconfig(OGRE)"

inherit rpm
