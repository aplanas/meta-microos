SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libOpenCL-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "2378b672badc5a40c7d62476e748917db48a7c717eb467810b76227f076f27d2eef05c8455c210935be8d9b6a28767e252ecf44bb22a1131598eafaefd8ccc8b"

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
