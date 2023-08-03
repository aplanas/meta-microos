SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libOpenCL-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "a48baea44c76dcf739a0b36ebfc8361ab3739cac5b09589d0692c2e202f1880faf48ee48debfe644b61f3d14e7463fd8bde6a4e5b81325ff38a202809042d9da"

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
libz.so.1"

inherit rpm
