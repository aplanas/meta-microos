SUMMARY = "The LLVM D Compiler"
DESCRIPTION = "LDC is an LLVM based compiler for the D programming language. It uses the \
frontend of the reference compiler (DMD), thereby supporting the same language \
features, but profits from LLVM's superior optimizing and code generation \
capabilities."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "ldc-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "e5805ecde7ac55fac42ef2d7c28dc8709ab00c02845bee7a57ad932fb152d2bcb55bd4fd71957b1094644b1f8deb921debd96ba1c9f7dc950b01a79d87d3fc24"

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
