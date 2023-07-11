SUMMARY = "Development files for the Ogre Overlay component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the overlay component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreOverlay-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "3345898bbc538fa984ec9c01b4599a7ec6e95e7308944d9dd0c4dcd57d5968ab9ab4bac8d1192951b5e8aadf66a1735aa62571c5eb22ca3bffc41010a7bb61a3"

RPROVIDES:${PN} += "libOgreOverlay-devel \
pkgconfig-OGRE-Overlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreOverlay13-5 \
pkgconfig-OGRE"

inherit rpm
