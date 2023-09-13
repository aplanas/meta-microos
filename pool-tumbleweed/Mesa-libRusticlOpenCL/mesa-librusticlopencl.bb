SUMMARY = "Mesa OpenCL implementation (Rusticl)"
DESCRIPTION = "This package contains the Mesa Rust-written OpenCL implementation."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libRusticlOpenCL-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "85832d46370b751c1d263f948ebd55b86802665022627e5f08c894b9f0660bff575b6feb53041076430e8bc428852a965f2565706a3bb04f4b5a0227a4e6a5fe"

RPROVIDES:${PN} += "Mesa-libRusticlOpenCL \
libRusticlOpenCL.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMSPIRVLib.so.16 \
libSPIRV-Tools-2023.4~rc2.so \
libSPIRV-Tools-link-2023.4~rc2.so \
libSPIRV-Tools-opt-2023.4~rc2.so \
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
