SUMMARY = "Haskell primes profiling library"
DESCRIPTION = "This package provides the Haskell primes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-prof-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "04f8d0cfe46c3ee62b28cd6ff216adaa8a82cc0c5937667c92c55c8e274e9196cd12267921f727aa986fac6b4120c9779f6f6704d7a1619347d058b33cbb1dc5"

RPROVIDES:${PN} += "ghc-primes-prof \
ghc-prof-primes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq"

RDEPENDS:${PN} += "ghc-primes-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
