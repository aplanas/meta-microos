SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-polly-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "f679f729dbca5dd299c2e4bbf79728400a3a0785cfc108aed395d8dd8d42a8fe8f00941c1c4e9499926648743e028f952b9ffa740aa380e9c14a7d4d842fef28"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm13-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
