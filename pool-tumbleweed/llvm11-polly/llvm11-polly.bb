SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-polly-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "deee42d1717c25e0a24e8a4f759af722b4fdaec29e357592371151a9b658aecb61fcccbaa43f9cfd817e0000e5adeee0e09f662fc954cd86941239f33b5f7bfd"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm11-polly \
llvm11-polly(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
