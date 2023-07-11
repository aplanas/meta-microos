SUMMARY = "GL-based viewer for HDR files"
DESCRIPTION = "pfsglview is a viewer program based on OpenGL for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsglview-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "22bb5d847299b84b0789bd88ab1794efbfa08fbe2ce6f84f05b06569797b678b09e224982d08c3da616030e5cc2b08e30e76421d920f8648708c814fe44cd5b9"

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
