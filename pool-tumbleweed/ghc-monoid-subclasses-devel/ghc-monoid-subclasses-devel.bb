SUMMARY = "Haskell monoid-subclasses library development files"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-devel-1.2.3-1.9.aarch64.rpm"
RPM_HASH = "0740ae505120ccc453e09ce07aec76a40cd900f48621e5953f2db5c8ecaa489127f4d63e0bb0c3a1a9da684079c71e99e6264708f1ed8f8de98486512cc5b974"

RPROVIDES:${PN} += "ghc-devel-monoid-subclasses-1.2.3-5taTwF7VZKRLlaKR3bOBXt \
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
