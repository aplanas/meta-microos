SUMMARY = "Development files for the Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the volume component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreVolume-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "711c1daa1b72be95c0a3e5351fba272e0e8540d293547e8564655553ec610b5e3036a86dc5cbd767e555b5b0c55be9561e772b43f2eb1fefef2b1b5beb31b3f0"

RPROVIDES:${PN} += "libOgreVolume-devel \
pkgconfig-OGRE-Volume"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreVolume13-5 \
pkgconfig-OGRE"

inherit rpm
