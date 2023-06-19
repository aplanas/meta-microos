SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-polly-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "cb51d4acda9a5bbd7a08842e12d863b4e961ffa6ce924cc0eea699c63cd0945fc3026ce0f662d5fc6c36b4bc18e0ee3b966c26358cbaf97241fac88b413436c2"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm15-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
