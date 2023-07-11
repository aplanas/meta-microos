SUMMARY = "C-based SPMD programming language compiler"
DESCRIPTION = "A compiler for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "ispc-1.18.1-2.2.aarch64.rpm"
RPM_HASH = "b82eb7a872f4ba960b092d5945b97d3f0e68a0a189b7876b76004e5582da2bf82fd143b270061c5aa8f8fb78e528e422bab618ae07aac3a5c39a586aa5054f47"

RPROVIDES:${PN} += "ispc"

RDEPENDS:${PN} += "ispc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libclang-cpp.so.14 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
