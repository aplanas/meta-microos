SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-polly-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "247013ddd87f6ae5945421f7becdc6c3b11789050ff4bd64faf28ba2883b9ab0e2da82841adb627845e18c295b7b30d0b8cb2b96116146e05f60f7dd5a446584"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm14-polly \
llvm14-polly(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
