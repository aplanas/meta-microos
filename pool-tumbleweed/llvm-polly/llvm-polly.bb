SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities. \
 \
This package is a dummy package that depends on the version of \
llvm-polly that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-polly-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "965095b5e16e32f7c9bda091182d2b30d3b8e42159b45beb9a29fe147d31c5d731dfe3b1bff27241f749a0ac9c3c66716a29dff40afb5b5024edde1c3cd994a3"

RPROVIDES:${PN} += "llvm-polly"

RDEPENDS:${PN} += "llvm16-polly"

inherit rpm
