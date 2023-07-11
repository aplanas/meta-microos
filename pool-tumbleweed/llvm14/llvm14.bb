SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "fdc343975aad6cd48c0064bc36ddf9402c06230383fd542f560f35534c45c001248c74b80f9e0222fd96b55779496ad22bbca549ff66868cdcb359ac82930d00"

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
