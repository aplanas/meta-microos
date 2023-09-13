SUMMARY = "SPIR-V shader compiler library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.6"

RPM_NAME = "libshaderc_shared1-2023.6-1.1.aarch64.rpm"
RPM_HASH = "e12a438a8c8840921cff2edfb6a2673ca3071c2fd2a6643a5f0d54e99711d9f1ea4acb5cccff64bc3337ad3df255b8e21ebff45ae4a76acd0989ebcec05e59d2"

RPROVIDES:${PN} += "libshaderc-shared.so.1 \
libshaderc-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
libSPIRV.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
