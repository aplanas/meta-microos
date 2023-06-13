SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "52367c10bfefc87c149707231f37c16cdc993acd2123452358e92c849766f18b44cf1c773d2800bbd3a581270f30efece57a46f580342cf7b683bafaed7ff7e5"

RPROVIDES:${PN} += "llvm11 \
llvm11(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.11()(64bit) \
libLLVM.so.11(LLVM_11)(64bit) \
libLLVM11 \
libLLVMTableGen.so.11()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
