SUMMARY = "Development files for the Ogre Main library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreMain-devel-13.5.3-1.5.aarch64.rpm"
RPM_HASH = "965343a13973524c7f87a8c20925617555e242745fe57bdbc6575f31c63b69098ec6ba8f672878dd66b3fae320ba28bde32125f3c0365125ced4c0ad7ae31b9b"

RPROVIDES:${PN} += "libOgreMain-devel \
libOgreMain-devel(aarch-64) \
pkgconfig(OGRE) \
pkgconfig(OGRE-PCZ)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMain13_5 \
libOgreMain13_5-codecs \
libOgreMain13_5-plugins \
ogre-media \
pkgconfig(freetype2) \
pkgconfig(x11) \
pkgconfig(xaw7) \
pkgconfig(xrandr) \
pkgconfig(zziplib)"

inherit rpm
