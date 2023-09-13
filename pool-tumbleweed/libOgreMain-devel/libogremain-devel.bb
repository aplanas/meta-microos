SUMMARY = "Development files for the Ogre Main library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "476c360d6159165b44899967de36373186ff81886869f0b12e1a868b2e3966c6e00a7880e4cc284a896e9dbdc968805febab4a0e3830a63674391f9bff1409c6"

RPROVIDES:${PN} += "libOgreMain-devel \
pkgconfig-OGRE \
pkgconfig-OGRE-PCZ"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMain13-5 \
libOgreMain13-5-codecs \
libOgreMain13-5-plugins \
ogre-media \
pkgconfig-freetype2 \
pkgconfig-x11 \
pkgconfig-xaw7 \
pkgconfig-xrandr \
pkgconfig-zziplib"

inherit rpm
