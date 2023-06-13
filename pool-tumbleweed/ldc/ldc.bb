SUMMARY = "The LLVM D Compiler"
DESCRIPTION = "LDC is an LLVM based compiler for the D programming language. It uses the \
frontend of the reference compiler (DMD), thereby supporting the same language \
features, but profits from LLVM's superior optimizing and code generation \
capabilities."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "a37cad9faefd43b4f4c82477c935b6c7e1afe3aaeabf49744670e8a454af7ee35c706a140f4bc424c5c94ea8ae17ca0f9e1de0ba04de426930d663ec9d506fc8"

RPROVIDES:${PN} += "config(ldc) \
ldc \
ldc(aarch-64)"

RDEPENDS:${PN} += "libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6()(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libphobos2-ldc-shared.so.102()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
