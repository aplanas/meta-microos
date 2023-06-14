SUMMARY = "OpenVDB command line tools"
DESCRIPTION = "This package contains the command line utilites that come with the OpenVDB \
library: vdb_lod, vdb_print, vdb_render, vdb_view"
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "openvdb-tools-9.0.0-3.5.aarch64.rpm"
RPM_HASH = "a83f1f88df454bfc6633380043a27b4677a117f0f2f1f53236d4ab30a13ce4515a8b024d20188613cf6de3f2a3a9750fc6b78845f7c3fc58b1e4c0b03595518d"

RPROVIDES:${PN} += "openvdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libblosc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libopenvdb.so.9.0 \
libopenvdb9-0 \
libstdc++.so.6 \
libtbb.so.12 \
libz.so.1"

inherit rpm
