SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-polly-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "668257a88d633448b57b4bb3fb8ec4113151dd17ba27be8da8f9a5cd22f2dbc54b4732e299d1c8c715e5176810f4ef37cf94999cab34ff51d76e2974b788f2ef"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm14-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
