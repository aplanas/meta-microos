SUMMARY = "Development files for the Ogre Overlay component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the overlay component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreOverlay-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "7ca6f793a027b3e9259dd0270adb403d1502dc8eb8609f28f91fcc0e07d571771c52a90576741f0a680d19ac7fede755578ddc5ae6aff2b06b466f3927f48b12"

RPROVIDES:${PN} += "libOgreOverlay-devel \
pkgconfig-OGRE-Overlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreOverlay13-5 \
pkgconfig-OGRE"

inherit rpm
