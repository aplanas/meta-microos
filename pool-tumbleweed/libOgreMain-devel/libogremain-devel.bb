SUMMARY = "Development files for the Ogre Main library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "2fecb959b41f082a4d482021192b5e1b32ec1863e7adf77676078ea5e77cbdc9b4861357c0b9e8dbfaa6fd0780a3e954ca2418c2df8706885639079b19cd96fc"

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
