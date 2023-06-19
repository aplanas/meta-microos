SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "7729c0ca30fafc0bf48b9c2909d0392e813c70895b77fba079971c1e2a7f15c47a7c223ba8d64a6f35b33897cf580353c2a480232c47870f207d0f4c7d7a2b2e"

RPROVIDES:${PN} += "llvm14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libLLVMTableGen.so.14 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
