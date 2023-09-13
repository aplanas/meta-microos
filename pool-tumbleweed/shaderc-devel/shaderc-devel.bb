SUMMARY = "Header files for the shaderc library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.6"

RPM_NAME = "shaderc-devel-2023.6-1.1.aarch64.rpm"
RPM_HASH = "0e8c7e0a2f17328a6246438b0cf3f55b34943c95bb3d5a7adb06b271bb05e1d668fb30fdc67101a98f18c6fd4654796424cc56d6e8a366109cd2f40555dec53c"

RPROVIDES:${PN} += "pkgconfig-shaderc \
shaderc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshaderc-shared1"

inherit rpm
