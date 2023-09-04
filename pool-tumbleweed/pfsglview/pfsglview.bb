SUMMARY = "GL-based viewer for HDR files"
DESCRIPTION = "pfsglview is a viewer program based on OpenGL for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsglview-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "c74c3825408fce49dddb2ad85b8365ec0d08da5601234cb54d3fe83e33195b0c251c200889d56825208605d53c185a77b1fae894aba21363d3947b2457d383b7"

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
