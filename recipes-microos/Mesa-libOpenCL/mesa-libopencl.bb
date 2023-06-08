SUMMARY = "Mesa OpenCL implementation (Clover)"
DESCRIPTION = "This package contains the Mesa OpenCL implementation or GalliumCompute."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libOpenCL-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "20f62f5a987ad6c31ce2ab33175a69873f596c21e4f7c56405e60e5706ff57bdf86f4d2ab04b56ff19a3f979d40b791616ce9d8b883d726798fef75139f5089f"

RPROVIDES:${PN} += "Mesa-libOpenCL Mesa-libOpenCL(aarch-64) libMesaOpenCL.so.1()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libLLVMSPIRVLib.so.16()(64bit) libSPIRV-Tools-2023.2.so()(64bit) libSPIRV-Tools-link-2023.2.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libclc(llvm16) libdrm.so.2()(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
