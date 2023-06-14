SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libOpenCL-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "489e73f0489e2780adfa2177b4b25ac8612c0dfc6b607307cfa066da23cfc36c04c0a1cf670fa0fdb03e893ecfa731f4dc4db5a676ea32c854ffaa13307aa2cf"

RPROVIDES:${PN} += "Mesa-libOpenCL \
libMesaOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-link-2023.3~rc1.so \
libc.so.6 \
libclang-cpp.so.16 \
libclc-llvm16 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
