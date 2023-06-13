SUMMARY = "GL-based viewer for HDR files"
DESCRIPTION = "pfsglview is a viewer program based on OpenGL for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsglview-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "a07aa54d49764f01349d948e9f029434d659e08afd23d11c1dc52d0a4aed3766a7569e83fbd07e2139249ba891965af23bb92bf51a7946aebe4a8c3c787f617d"

RPROVIDES:${PN} += "pfsglview \
pfsglview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglut.so.3()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
