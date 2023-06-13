SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "ff7dcb7f10f2bcf0bb9b0229e89120a40ea20792ec2a271d12e82656096581306e07b42b781c3202b65f601c7404dfaab0408534cf346bf50fc6188e4eda58e6"

RPROVIDES:${PN} += "llvm15 \
llvm15(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libLLVMTableGen.so.15()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
