SUMMARY = "Haskell haddock-library profiling library"
DESCRIPTION = "This package provides the Haskell haddock-library profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-prof-1.11.0-2.8.aarch64.rpm"
RPM_HASH = "f867c5926e4761398b80051d260591c33f0b81de897df5ab3fa6330031c99d26d1d1ce9b3cd93a93dbe52b68b2d77bcd8a0c49715228ecafed79102861a8852d"

RPROVIDES:${PN} += "ghc-haddock-library-prof \
ghc-prof-haddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp"

RDEPENDS:${PN} += "ghc-haddock-library-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
