SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libOpenCL-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "35fbe694dc48e850bdf0d3667dd5422f137ed4054ff66c1608eb56157a1ded065c56189fcfa7d9077c973478a74d27feec283f3bc542caa87510b314a1b1bed6"

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
