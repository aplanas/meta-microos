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

PV = "16.0.4"

RPM_NAME = "clang-tools-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "bcaa4a83623c915d2e241ef2dae9ea6ca842d3c89252d0a6d37861a77579afb004fe47c027d3f6ead9ee7f7924fc611968487b431a595df544f4f16b302cef6b"

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
