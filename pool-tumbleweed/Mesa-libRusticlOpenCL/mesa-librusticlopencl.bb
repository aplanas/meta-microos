SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libRusticlOpenCL-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "6229e61484b3c5583a20a23ecbadc99b4ec71a1980d6b9ec726a482dc0a88c4f2831ec5a3195d929ccb29b4b4fb701b20f7e425c9912f1e939eacefe49fc9861"

RPROVIDES:${PN} += "Mesa-libRusticlOpenCL \
libRusticlOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-link-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
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
