SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libOpenCL-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "a7f2a43acead54cc8e11a0704032b2e927c9a2e981f60b8c9208b899f01cab8230c2c2f9ee71c79639e0ffccd871cd83889044bf73ef94eb75c9598059b4c7e7"

RPROVIDES:${PN} += "Mesa-libOpenCL \
libMesaOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-link-2023.4~rc2.so \
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
