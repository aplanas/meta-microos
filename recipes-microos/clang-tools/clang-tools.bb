SUMMARY = "Tools for Clang"
DESCRIPTION = "This package contains tools and scripts for using Clang, including: \
* bash completions for clang, \
* the clang-doc tool, \
* plugins for using clang-format, clang-rename, clang-include-fixer \
  in vim and emacs. \
* scripts for using clang-format: git-clang-format and clang-format-diff, \
* scripts for using clang-tidy: run-clang-tidy and clang-tidy-diff, \
* scripts for using the Clang static analyzer: scan-build and scan-view, \
* a script for using find-all-symbols: run-find-all-symbols."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "clang-tools-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "9530ff7609c0b15b9e0685fddef05636c82fa9dea57199b8cb1c27d01e692522da89adb7a13cfe4cbcc0ae21fd79fc992f866cf41e99f951b5ab088d8a66ab89"

RPROVIDES:${PN} += "clang-tools clang-tools(aarch-64) emacs-llvm scan-build scan-view"
RDEPENDS:${PN} += "/usr/bin/clang /usr/bin/perl /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
