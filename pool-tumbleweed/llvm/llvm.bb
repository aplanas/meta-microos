SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality. \
 \
This package is a dummy package that depends on the version of \
llvm that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "74b6c44424e383c402f6c4b02eefed0bb28ef42b4745d87131c92a0cf59e77d3a41d5fb9d3ded9a89e3a5318b6469f8c2ecd17936b5cadf6a11dfeeadd0d51b8"

RPROVIDES:${PN} += "llvm"

RDEPENDS:${PN} += "llvm16"

inherit rpm
