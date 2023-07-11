SUMMARY = "The LLVM D Compiler"
DESCRIPTION = "LDC is an LLVM based compiler for the D programming language. It uses the \
frontend of the reference compiler (DMD), thereby supporting the same language \
features, but profits from LLVM's superior optimizing and code generation \
capabilities."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-1.32.0-1.2.aarch64.rpm"
RPM_HASH = "ed429aec4a924208d4d7ed9e7df605d748381c207c7a7e45fc94360a46683de5ae40132caaa2b9baa7ebf1036b6f34641f68132fe4cd6070bd03fb34b654f5ad"

RPROVIDES:${PN} += "config-ldc \
ldc"

RDEPENDS:${PN} += "libLLVM.so.15 \
libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libm.so.6 \
libphobos2-ldc-shared.so.102 \
libstdc++.so.6"

inherit rpm
