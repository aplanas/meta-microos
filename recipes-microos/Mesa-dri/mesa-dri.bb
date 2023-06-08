SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "f7483ca395b008c8362e2d125e4de838c2c3c36f3547ed01256022e2382554857717ebd20f441ff50fcbe9605a6ff6d12a701fcc3c1827e8c7da30fb6963dcde"

RPROVIDES:${PN} += "Mesa-dri Mesa-dri(aarch-64) config(Mesa-dri) libgallium_dri.so()(64bit)"
RDEPENDS:${PN} += "Mesa ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libdrm_amdgpu.so.1()(64bit) libdrm_nouveau.so.2()(64bit) libdrm_radeon.so.1()(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglapi.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
