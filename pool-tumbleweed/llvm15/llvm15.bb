SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "5b2d68ab9ffb58edc39f569cdb4adb967569eddb0ddd5110ec0f16e8ac9ce5dc7a5e76447347af3e73db08239160da08fc7a5c823037da7a389e71cb194e1b80"

RPROVIDES:${PN} += "llvm15"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libLLVMTableGen.so.15 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
