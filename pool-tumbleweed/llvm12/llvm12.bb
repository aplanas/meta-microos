SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "7aa6ec7d8b5caa9892e65dbf59a6c67e9ec38caedb543f4826e8832e3191357e64c4dbe96ef0030b9e39aaaf3a5cbe0dd5f24f89259b789d20e1a87f106d19c2"

RPROVIDES:${PN} += "llvm12"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libLLVM12 \
libLLVMTableGen.so.12 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
