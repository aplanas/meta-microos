SUMMARY = "OpenGL and OpenGL ES shader front end implementation"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages."
LICENSE = "BSD-3-Clause"

PV = "13.0.0"

RPM_NAME = "libglslang13-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "7987b1eadbccff61beac186eaf102cdd56fcb23084bbb6715fa5c7ae7206f64281b7b7ea3fefb7db3e302fec39f5878a6a0fe0b36be1fe4e05ed577447763f50"

RPROVIDES:${PN} += "libHLSL.so.13 \
libSPIRV.so.13 \
libSPVRemapper.so.13 \
libglslang-default-resource-limits.so.13 \
libglslang.so.13 \
libglslang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
