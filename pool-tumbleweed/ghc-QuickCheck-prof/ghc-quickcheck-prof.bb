SUMMARY = "Haskell QuickCheck profiling library"
DESCRIPTION = "This package provides the Haskell QuickCheck profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-prof-2.14.3-1.3.aarch64.rpm"
RPM_HASH = "3f9a9b1bf55e14180f03e45536c0fac0ed33960ef1253ad249e4e9b71b6a1d3789936aa6bbc90ccbe5eb7f5c388cea3f5c2c1da786df8fd8bd7a2c71dc9556f5"

RPROVIDES:${PN} += "ghc-QuickCheck-prof \
ghc-prof-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X"

RDEPENDS:${PN} += "ghc-QuickCheck-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
