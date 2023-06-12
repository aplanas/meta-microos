SUMMARY = "A tool to convert perf.data profile to AutoFDO profile"
DESCRIPTION = "This package contains a tool to convert perf.data profile to AutoFDO \
profile that can be used by GCC and LLVM. \
 \
Each compiler is supported by a different tool. For GCC, use \
'create_gcov'. For LLVM, use 'create_llvm_prof'. The two tools \
have compatible command line flags. However, the outputs are \
incompatible. You cannot use the profile generated for GCC in \
LLVM and vice-versa."
LICENSE = "Apache-2.0"

PV = "0.18"

RPM_NAME = "autofdo-0.18-5.6.aarch64.rpm"
RPM_HASH = "bddeafe335b4263463a930bc3a7c39261085009fffc7717ab75009eb5b096e808d75fcf2fe4ba51e9449041219947526c9276d3d158c8fce411f146d1d13e3db"

RPROVIDES:${PN} += "autofdo \
autofdo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
