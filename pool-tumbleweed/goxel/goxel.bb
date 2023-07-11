SUMMARY = "Voxel graphics editor"
DESCRIPTION = "Goxel is an open source voxel graphics editor. Voxels are 3D images formed \
of cubic elements."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "goxel-0.11.0-1.4.aarch64.rpm"
RPM_HASH = "96526d99294baa15410e94e276a1242c1cf9503975ea95fb7aff9137d934901b546f6fb326146ff0f92f296e536b7f43032191ea74e0e1bcc0d8356283c23904"

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
