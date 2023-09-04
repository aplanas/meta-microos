SUMMARY = "Haskell containers profiling library"
DESCRIPTION = "This package provides the Haskell containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-prof-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "bb0e96cb9f9621bbdc41d9ec3c0f3bde05c843125b307e1a618cfb8290e745f001f06b3ae50ff50b8c1ef91a723e7dbfee61759765fe8bf68076d073900a6a39"

RPROVIDES:${PN} += "ghc-containers-prof \
ghc-prof-containers-0.6.7"

RDEPENDS:${PN} += "ghc-containers-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
