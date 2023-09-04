SUMMARY = "Haskell monoid-subclasses profiling library"
DESCRIPTION = "This package provides the Haskell monoid-subclasses profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-prof-1.2.3-1.9.aarch64.rpm"
RPM_HASH = "56ab179956e19387dee1c05d073dde0ff709f6ab4937964d77f05d5204746538846578763b72ac9cb742c37c5ca4fe2fbf1d855f1bcef7f6654f6fff9f027be8"

RPROVIDES:${PN} += "ghc-monoid-subclasses-prof \
ghc-prof-monoid-subclasses-1.2.3-5taTwF7VZKRLlaKR3bOBXt"

RDEPENDS:${PN} += "ghc-monoid-subclasses-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-commutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd \
ghc-prof-containers-0.6.7 \
ghc-prof-primes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq \
ghc-prof-text-2.0.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
