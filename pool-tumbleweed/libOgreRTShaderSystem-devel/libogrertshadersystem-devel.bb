SUMMARY = "Development files for the OGRE Runtime Shader System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Runtime Shader System \
(RTSS) component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreRTShaderSystem-devel-13.5.3-2.2.aarch64.rpm"
RPM_HASH = "2f9a5e17d77bf71c9c94c8ffe7ca30e6d53dc07b07d650372a158cd1cd6a8b1228ec7e3d0807b5d3ff457c15504e17ced45e059937d077e3fb0dec5c7e464021"

RPROVIDES:${PN} += "libOgreRTShaderSystem-devel \
pkgconfig-OGRE-RTShaderSystem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreRTShaderSystem13-5 \
pkgconfig-OGRE"

inherit rpm
