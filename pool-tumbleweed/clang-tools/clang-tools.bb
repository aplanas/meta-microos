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
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "clang-tools-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "deb4cb4546e8316e3fba42e6467789d9abb6e18f1de991735c481fa38965c0becc5ca1ada4c0c97ccf2b0f1c3bcdc903ac621ab721c615defe3acfda190fd92d"

RPROVIDES:${PN} += "clang-tools \
emacs-llvm \
scan-build \
scan-view"

RDEPENDS:${PN} += "/usr/bin/clang \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
