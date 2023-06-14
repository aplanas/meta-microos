SUMMARY = "GL-based viewer for HDR files"
DESCRIPTION = "pfsglview is a viewer program based on OpenGL for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsglview-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "a07aa54d49764f01349d948e9f029434d659e08afd23d11c1dc52d0a4aed3766a7569e83fbd07e2139249ba891965af23bb92bf51a7946aebe4a8c3c787f617d"

RPROVIDES:${PN} += "pfsglview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libgomp.so.1 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
