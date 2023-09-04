SUMMARY = "Haskell strict profiling library"
DESCRIPTION = "This package provides the Haskell strict profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-prof-0.5-1.7.aarch64.rpm"
RPM_HASH = "e0aa257a595c3f143d3146c1bcec053c3552628cc9cad02e58f1655f10106dd8baa3e9152253404a7a256f372c44b4a2d8e598e554bc9cb009a83c86991b275d"

RPROVIDES:${PN} += "ghc-prof-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-strict-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-text-2.0.2 \
ghc-prof-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-prof-transformers-0.5.6.2 \
ghc-strict-devel"

inherit rpm
