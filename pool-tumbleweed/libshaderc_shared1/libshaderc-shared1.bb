SUMMARY = "SPIR-V shader compiler library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2023.4"

RPM_NAME = "libshaderc_shared1-2023.4-1.1.aarch64.rpm"
RPM_HASH = "debfd8ee10c0912f142d83fa031b48adfb9b2a5d96431f245a8ca12b96c51d86f5828b7a265e9f2cfb9e36d48c7e4ef87ee8a9bcf637ad5e105951e937655512"

RPROVIDES:${PN} += "libshaderc-shared.so.1 \
libshaderc-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-opt-2023.3~rc1.so \
libSPIRV.so.12 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
