SUMMARY = "Qt oriented code checker based on the Clang framework"
DESCRIPTION = "clazy is a compiler plugin which allows Clang to understand Qt semantics. \
You get more than 50 Qt related compiler warnings, ranging from unneeded memory \
allocations to misusage of API, including fix-its for automatic refactoring."
LICENSE = "LGPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "clazy-1.11-3.3.aarch64.rpm"
RPM_HASH = "9d56a8844f787d0b375d49c121fb98e351f921014f5c52ed4ca4b8845b518876d8614a653b01c7082248106b2e68871fb80113b14c9c7bd98c2f4597d7db62ef"

RPROVIDES:${PN} += "clazy clazy(aarch-64) metainfo() metainfo(org.kde.clazy.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh clang16 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
