SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libRusticlOpenCL-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "5a9a9903886b1d120a86cb36dad3dc07bbaa7f74b1ec99fb6d6efef91473c59aff4dc6259809a17d18fde36c58417838d7c064caffd90034b74c2e681debb4a4"

RPROVIDES:${PN} += "Mesa-libRusticlOpenCL \
libRusticlOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-link-2023.3~rc1.so \
libSPIRV-Tools-opt-2023.3~rc1.so \
libc.so.6 \
libclang-cpp.so.16 \
libclc-llvm16 \
libdrm-amdgpu.so.1 \
libdrm-nouveau.so.2 \
libdrm-radeon.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
