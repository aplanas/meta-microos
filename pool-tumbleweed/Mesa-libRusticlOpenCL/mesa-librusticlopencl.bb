SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libRusticlOpenCL-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "4c7876428152e3ca17a712f5c977d6a54babb7a28d14e56dee52dfc26100780ab87aec24ac969565fdc25eac2b89c17859394ad0a9ded9555729f2e4c10f57d3"

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
libdrm-nouveau.so.2 \
libdrm.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
