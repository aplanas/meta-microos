SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libRusticlOpenCL-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "4c7876428152e3ca17a712f5c977d6a54babb7a28d14e56dee52dfc26100780ab87aec24ac969565fdc25eac2b89c17859394ad0a9ded9555729f2e4c10f57d3"

RPROVIDES:${PN} += "Mesa-libRusticlOpenCL \
Mesa-libRusticlOpenCL(aarch-64) \
libRusticlOpenCL.so.1()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libLLVMSPIRVLib.so.16()(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-link-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libclc(llvm16) \
libdrm.so.2()(64bit) \
libdrm_nouveau.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
