SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "08ff4dabbab4d0e16c08c6d616d5ee8b75c513fa7550f17ef6ab20877e12c486550192b460534b3a79871ed4dcbd97ee407b158f937b3413e860cc6d69fe4c92"

RPROVIDES:${PN} += "llvm13"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libLLVMTableGen.so.13 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
