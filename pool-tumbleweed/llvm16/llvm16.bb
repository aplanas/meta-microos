SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "fcaf77e406ae87ae0c7296d7a6ae852cd7141cc61ee42c69b79b72a925c0ab2ab72199eeaf95f1d1e6c01e36dc576c92aa85b9a74b9e0c81d80c1d09d1350137"

RPROVIDES:${PN} += "llvm16"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libLLVMTableGen.so.16 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
