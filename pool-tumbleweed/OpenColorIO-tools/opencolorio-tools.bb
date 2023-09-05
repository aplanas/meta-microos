SUMMARY = "Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-tools-2.1.2-4.1.aarch64.rpm"
RPM_HASH = "9c5ff564c6aa356ba79deccf6956fc610c0f2aca78de91428c15ac0bae6b2f13fdf58b52d6fcd5f512d4044eb7524c3d3143389021d0be6028a1f70770ee0ef3"

RPROVIDES:${PN} += "OpenColorIO-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libGLX.so.0 \
libOpenColorIO.so.2.1 \
libOpenGL.so.0 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
