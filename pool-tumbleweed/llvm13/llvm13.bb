SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "c92462f6f6829984ca45647a50ff7993162314fa24b981f56b9965e799b4ebf9241edb0efe598ef1389e37820113570f4cbfff956eded3a6307efe160c1a9519"

RPROVIDES:${PN} += "llvm13 \
llvm13(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libLLVMTableGen.so.13()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
