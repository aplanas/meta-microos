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

PV = "16.0.4"

RPM_NAME = "llvm-polly-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "b108dbc4730d0703adc11452a6c28afc04d024364f25ae4eaae2e797447c98fcb51faa7575f399fecb071ad0aa7b46d88a4b266ba6b3ff2966852c2d542cd3f9"

RPROVIDES:${PN} += "llvm-polly"

RDEPENDS:${PN} += "llvm16-polly"

inherit rpm
