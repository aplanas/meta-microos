SUMMARY = "Development files for the Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the volume component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreVolume-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "e10c1428ec69b642006eb0507a511a73f7ae372340695bb9a10a21448f9b6336a18fe56012ec5f1f66d964922acbab8a757132874a996efcdaef0aaafe8808db"

RPROVIDES:${PN} += "libOgreVolume-devel \
pkgconfig-OGRE-Volume"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreVolume13-5 \
pkgconfig-OGRE"

inherit rpm
