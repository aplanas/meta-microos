SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-polly-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "f78327ed7707cb242bb93d0d169a8025131de09ba9afa061bb6f90b97d7102102e38f1a52890263ad6dd237a9319111c708dd1b1f9b7a23503df1ffd0df92f0d"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm12-polly \
llvm12-polly(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
