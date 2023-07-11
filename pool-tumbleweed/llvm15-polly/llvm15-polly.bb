SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-polly-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "a5b23d35a0f5fffac472127d9fbef5691b08facf9a7162196c894188b53ff47e43c0d3d281a7cfe238ce733ab2ec061f5430934455b6cb7e462670d4e5768e4a"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm15-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
