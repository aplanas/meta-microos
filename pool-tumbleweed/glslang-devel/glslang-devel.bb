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

PV = "12.3.1+sdk261"

RPM_NAME = "glslang-devel-12.3.1+sdk261-1.1.aarch64.rpm"
RPM_HASH = "1bd84e4d5a3145bf70ef31699bdfc52e8ec486ae013bec4daac840e74c4497b0cfe7d944963c76905416aa13af1bec91cb40c0f7661f7e5491a48ed287f72fb4"

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
