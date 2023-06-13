SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-polly-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "f5ca5abf7b1b027b16aa6ccde4c36221ce61907d97c1fa8f3ccd8e245d47646b1dea64ee4d2219d959ecec9c81351d9e340de3d31be23639c3ea2622cef5dd34"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm13-polly \
llvm13-polly(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
