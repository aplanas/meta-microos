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

PV = "13.0.0"

RPM_NAME = "glslang-devel-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "a1041ad072ef14d00301c63d0ac2ef87fe10448aff79a686f1070af88deea74892596ccc65efa305dfa565efcf1bc294fa655b6a115f8c4cec94c1aea1491477"

RPROVIDES:${PN} += "cmake-glslang \
glslang-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV.so.13 \
libSPVRemapper.so.13 \
libc.so.6 \
libglslang-default-resource-limits.so.13 \
libglslang.so.13 \
libglslang13 \
libstdc++.so.6"

inherit rpm
