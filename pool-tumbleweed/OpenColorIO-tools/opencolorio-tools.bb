SUMMARY = "Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-tools-2.1.2-3.1.aarch64.rpm"
RPM_HASH = "8e5007702b6b9066a9752246f1a8d3bd01c4e30937ff5c190f52145c6279af9011f05076c23e70c3c9c38f0fba99c340810a6073dbd68d688e821214d6a18caa"

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
