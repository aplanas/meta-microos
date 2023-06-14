SUMMARY = "C-based SPMD programming language compiler"
DESCRIPTION = "A compiler for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "ispc-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "e19d68798bf4d230f451326cbf8986a869fed6ee95eec6907582b8d69d2dfc9fb327900985f26b5d30b687591470f1227e2b0a2a9c3ab812e0d4873502c52999"

RPROVIDES:${PN} += "ispc"

RDEPENDS:${PN} += "ispc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libclang-cpp.so.14 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
