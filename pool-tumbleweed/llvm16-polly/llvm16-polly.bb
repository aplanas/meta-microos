SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-polly-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "c4052b5e454c7c610f9a92ca8d75e286807ccc9cd679a8d1a8eaad018aab4902bec2dc3beedce83288821cfbe267169458b558a68a966f2354a458a48ac02c2f"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm16-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
