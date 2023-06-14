SUMMARY = "Voxel graphics editor"
DESCRIPTION = "Goxel is an open source voxel graphics editor. Voxels are 3D images formed \
of cubic elements."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "goxel-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "06d8d5a75a72e021c76ada705a2e003753811c0152a60cdc767fac466f3196d5b7b52d46ded27d1162345a33c90492bac0ab423239a01eaa78d7b387885dea8a"

RPROVIDES:${PN} += "goxel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
