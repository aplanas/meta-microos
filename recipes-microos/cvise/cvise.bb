SUMMARY = "Super-parallel Python port of the C-Reduce"
DESCRIPTION = " \
C-Vise is a super-parallel Python port of the C-Reduce. The port is fully \
compatible to the C-Reduce and uses the same efficient \
LLVM-based C/C++ reduction tool named clang_delta. \
 \
C-Vise is a tool that takes a large C, C++ or OpenCL program that \
has a property of interest (such as triggering a compiler bug) and \
automatically produces a much smaller C/C++ or OpenCL program that \
has the same property. It is intended for use by people who discover \
and report bugs in compilers and other tools that process C/C++ or OpenCL code."
LICENSE = "BSD-3-Clause"

PV = "2.8.0+git.20230428.7aaa251"

RPM_NAME = "cvise-2.8.0+git.20230428.7aaa251-1.1.aarch64.rpm"
RPM_HASH = "7345e7143da2ff849a14a3d091f2a7ae4abd3bae7282c09931e6c50ee9e3775ed544fbbbfb036046d98d45aa180b0f5302d8a5171e05e57383caa2b1318efab8"

RPROVIDES:${PN} += "cvise cvise(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env astyle clang colordiff indent ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) llvm python3-Pebble python3-chardet python3-psutil unifdef"

inherit rpm
