SUMMARY = "Haskell monoid-subclasses profiling library"
DESCRIPTION = "This package provides the Haskell monoid-subclasses profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "ghc-monoid-subclasses-prof-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "dadd801d5dcb9c97ad3b5ae35b6e37277229c86b678cd47d0822756867dd1a3d45d7ca9a5ea3abd30b0b215572a6c93c31edf662d790a22ac8e61d04c1455cc4"

RPROVIDES:${PN} += "ghc-monoid-subclasses-prof \
ghc-prof-monoid-subclasses-1.2.4-19X6M9mjCjC7gPD9QVvKTU"

RDEPENDS:${PN} += "ghc-monoid-subclasses-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-commutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd \
ghc-prof-containers-0.6.7 \
ghc-prof-primes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq \
ghc-prof-text-2.0.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
