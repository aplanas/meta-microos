SUMMARY = "SPIR-V shader compiler library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "libshaderc_shared1-2023.4-1.2.aarch64.rpm"
RPM_HASH = "66a9cd77fc00b6beb5b814d9c8551df39f3a067b264e215bf18f3d0f73af1a1ff9de66df3d9791cc4024cd33e957c823bd42ad3648cbc1cdc8279fd881852ee5"

RPROVIDES:${PN} += "libshaderc-shared.so.1 \
libshaderc-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV.so.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
