SUMMARY = "Haskell indexed-traversable profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-prof-0.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "75aa97accb2369cb5dbceb3af60af0e0478414aa7824f10fcd2a7968be54d6085f99febda708e7434898e975006a15753074221c87ff9cfba5db034f7379e39b"

RPROVIDES:${PN} += "ghc-indexed-traversable-prof \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO"

RDEPENDS:${PN} += "ghc-indexed-traversable-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
