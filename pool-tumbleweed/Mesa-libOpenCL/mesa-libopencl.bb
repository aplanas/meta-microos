SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libOpenCL-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "489e73f0489e2780adfa2177b4b25ac8612c0dfc6b607307cfa066da23cfc36c04c0a1cf670fa0fdb03e893ecfa731f4dc4db5a676ea32c854ffaa13307aa2cf"

RPROVIDES:${PN} += "Mesa-libOpenCL \
Mesa-libOpenCL(aarch-64) \
libMesaOpenCL.so.1()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libLLVMSPIRVLib.so.16()(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-link-2023.3~rc1.so()(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libclc(llvm16) \
libdrm.so.2()(64bit) \
libelf.so.1()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
