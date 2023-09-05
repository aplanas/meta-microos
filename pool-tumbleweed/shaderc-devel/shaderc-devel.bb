SUMMARY = "Header files for the shaderc library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "shaderc-devel-2023.4-1.2.aarch64.rpm"
RPM_HASH = "9779b7368da321fbdcc1547a2a15c4b15d294273b89f9db3567fc96ad656bb927cb4132339fb8910aa5bfb1ef3a4a6580bfb45439ac88d7e44de4c8b0c2ebfc9"

RPROVIDES:${PN} += "pkgconfig-shaderc \
shaderc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshaderc-shared1"

inherit rpm
