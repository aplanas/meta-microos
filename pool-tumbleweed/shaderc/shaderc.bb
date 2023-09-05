SUMMARY = "A collection of tools, libraries and tests for shader compilation"
DESCRIPTION = "A collection of tools, libraries and tests for shader compilation. \
Included are: \
 \
* glslc, a command line compiler for GLSL/HLSL to SPIR-V, and \
* libshaderc, a library API for doing the same. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools."
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "shaderc-2023.4-1.2.aarch64.rpm"
RPM_HASH = "53dba3138671f46c5a88cc9e300fcb3e1c9245326eebb45add8c471aaa294f5baefd8b55d55833ba0a4bdaeaea8f78a131e24247d67091a74632a146a9f17eb0"

RPROVIDES:${PN} += "shaderc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV.so.12 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.12 \
libstdc++.so.6"

inherit rpm
