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

RPM_NAME = "shaderc-2023.4-1.1.aarch64.rpm"
RPM_HASH = "0cd2166ea9913d2d439a9efd749aa18ef1189dbf10c87cefcaa3392ec1f38adcba4a5f4878c7097651fa455e3622e67191d689d06c0a6495cad1a35639daf0f0"

RPROVIDES:${PN} += "shaderc \
shaderc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) \
libSPIRV.so.12()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglslang.so.12()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
