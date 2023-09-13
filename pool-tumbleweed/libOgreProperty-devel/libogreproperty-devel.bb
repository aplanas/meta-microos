SUMMARY = "Development files for the Ogre Property component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the property component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreProperty-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "94c176a6222df77037ce38752f7258adaca25c7da646a5c2c93c53bcd9c91aa96eb0c68a83a6a151be1d0d51e1fac28228afba53b81be40e01b27b36d4ee52d1"

RPROVIDES:${PN} += "libOgreProperty-devel \
pkgconfig-OGRE-Property"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreProperty13-5 \
pkgconfig-OGRE"

inherit rpm
