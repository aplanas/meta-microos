SUMMARY = "Haskell monoid-subclasses library development files"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "ghc-monoid-subclasses-devel-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "a12ffe7a42a802d1de6e82d0323712842543cd26b226f23c0c6055a3b2100c0885d6cf35ec5a60a9847e3eb7b7384dd7a6bdd13241d37cae0f713b23c2ba92a6"

RPROVIDES:${PN} += "ghc-devel-monoid-subclasses-1.2.4-19X6M9mjCjC7gPD9QVvKTU \
ghc-monoid-subclasses-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-commutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd \
ghc-devel-containers-0.6.7 \
ghc-devel-primes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq \
ghc-devel-text-2.0.2 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-monoid-subclasses"

inherit rpm
