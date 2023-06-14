SUMMARY = "OpenGL and OpenGL ES shader front end and validator"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
spirv-remap is a utility to improve compression of SPIR-V binary \
files via entropy reduction, plus optional stripping of debug \
information and load/store optimization. It transforms SPIR-V to \
SPIR-V, remapping IDs. The resulting modules have an increased ID \
range (IDs are not as tightly packed around zero), but will compress \
better when multiple modules are compressed together, since \
compressor's dictionary can find better cross module commonality."
LICENSE = "BSD-3-Clause"

PV = "12.2.0"

RPM_NAME = "glslang-devel-12.2.0-1.1.aarch64.rpm"
RPM_HASH = "e43a5195dcd6865c81edce6cc32f432d4412ce36a735d65fb676bb0e66900be399bd11ab7c7c8f1194e0885c72bc12f427f4c5125743104222d4985ce69d0961"

RPROVIDES:${PN} += "cmake-glslang \
glslang-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV.so.12 \
libSPVRemapper.so.12 \
libc.so.6 \
libglslang-default-resource-limits.so.12 \
libglslang.so.12 \
libglslang12 \
libstdc++.so.6"

inherit rpm
