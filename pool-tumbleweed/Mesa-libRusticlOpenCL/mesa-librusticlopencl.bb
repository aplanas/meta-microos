SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libRusticlOpenCL-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "4f7455589b5edebc04a5878f525f620cff8a9ae1a37a35a69c687bbf58b92d2ca96228ff82929d54596321beba0d21dbeb4efdb253174ef000f0dbbd73cdd893"

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
