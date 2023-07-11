SUMMARY = "OpenVDB command line tools"
DESCRIPTION = "This package contains the command line utilites that come with the OpenVDB \
library: vdb_lod, vdb_print, vdb_render, vdb_view"
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "openvdb-tools-9.0.0-3.6.aarch64.rpm"
RPM_HASH = "d8f933010e38d055a9442bdd2a25fbe8a77c7ffa0a8d8836c29ab6200c0e21bcff35fb1bb9f333cc1148685c7e0cda81f1efe6a6cc25506ec29926966dc1ac46"

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
