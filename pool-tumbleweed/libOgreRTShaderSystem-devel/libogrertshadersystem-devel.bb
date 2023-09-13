SUMMARY = "Development files for the OGRE Runtime Shader System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Runtime Shader System \
(RTSS) component."
LICENSE = "LGPL-2.1-only"

PV = "13.5.3"

RPM_NAME = "libOgreRTShaderSystem-devel-13.5.3-2.3.aarch64.rpm"
RPM_HASH = "ccea9d1de0b25727b2a93e4cd6b2ce56c5d0d9dabf050dbe7939acfdaa26a33b80e1fa1fb09707816c206f8426c8459c66b9d7f8bc81ab61780dc27cda7124b2"

RPROVIDES:${PN} += "libOgreRTShaderSystem-devel \
pkgconfig-OGRE-RTShaderSystem"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreRTShaderSystem13-5 \
pkgconfig-OGRE"

inherit rpm
