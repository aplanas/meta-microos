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

PV = "16.0.6"

RPM_NAME = "llvm-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "7f6e2b53fafecf9c963354822fe1c90936332ecd638715ef56c0437180869f0625521b80a5a6e30a7e7365e68c034d6bf057d6315dcb78cb1a9e182cb5ec84da"

RPROVIDES:${PN} += "llvm"

RDEPENDS:${PN} += "llvm16"

inherit rpm
