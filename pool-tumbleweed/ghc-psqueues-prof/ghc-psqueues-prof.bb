SUMMARY = "Haskell psqueues profiling library"
DESCRIPTION = "This package provides the Haskell psqueues profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-prof-0.2.7.3-2.9.aarch64.rpm"
RPM_HASH = "b4bab0e198464999b4f0bab9a7a7e32916d27d939780cecc092f90e09e4bdff3a07a8c27d2dec5c1e80def20531c50e594b8e75a73ad751c9a70a5e831cdcf52"

RPROVIDES:${PN} += "ghc-prof-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-psqueues-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-psqueues-devel"

inherit rpm
