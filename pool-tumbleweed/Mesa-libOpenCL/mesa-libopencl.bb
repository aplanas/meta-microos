SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libOpenCL-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "31dfebff86222421b405120c3962b645b153f0e81205aca70ca97fa7147d8c29c674b5648036d67020225ab1c5e4620d3f60aeade7b52f432666190c993317cf"

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
