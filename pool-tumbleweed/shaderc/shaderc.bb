SUMMARY = "A collection of tools, libraries and tests for shader compilation"
DESCRIPTION = "A collection of tools, libraries and tests for shader compilation. \
Included are: \
 \
* glslc, a command line compiler for GLSL/HLSL to SPIR-V, and \
* libshaderc, a library API for doing the same. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools."
LICENSE = "Apache-2.0"

PV = "2023.6"

RPM_NAME = "shaderc-2023.6-1.1.aarch64.rpm"
RPM_HASH = "16b3d91d14fd1bb55b620e22f8931991701df9d9141d24f0d8f42ed272945b293543e4dace19a9f9264c874bc866e8cf9b435994d5dc4ea04b4dea38bdfffdc2"

RPROVIDES:${PN} += "shaderc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.13 \
libstdc++.so.6"

inherit rpm
