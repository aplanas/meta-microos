SUMMARY = "Haskell text-short profiling library"
DESCRIPTION = "This package provides the Haskell text-short profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-prof-0.1.5-3.8.aarch64.rpm"
RPM_HASH = "5f55c8cb65dbf1d52ac2f9e7e5783b97aa6f1c39c3cc5a1ba28d3d2986fe3bb75828e934964a246ee0da4fc4455b87ea4544bf6253b646d2a3b935aa9c0d475b"

RPROVIDES:${PN} += "ghc-prof-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-text-short-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-text-short-devel"

inherit rpm
