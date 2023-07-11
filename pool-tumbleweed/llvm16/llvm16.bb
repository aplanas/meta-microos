SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "bf49448c601d329d70e0bbc2d1054a378b2605593a287e4c38242ce630343b252a684fd4fe73ee277cfdc7a96b4421e78364b58bf684c5bd46c366d09f3f984f"

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
