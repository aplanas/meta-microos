SUMMARY = "Haskell blaze-builder profiling library"
DESCRIPTION = "This package provides the Haskell blaze-builder profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-prof-0.4.2.2-3.8.aarch64.rpm"
RPM_HASH = "8d03fc5a13295fdba260a50be3871d2309aace971c69e54b773c7d08abc3347ba6c03c6abb0b0d0de38a5eef71f0a6239bfa1addedccb542b134d0fdcc0641a7"

RPROVIDES:${PN} += "ghc-blaze-builder-prof \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h"

RDEPENDS:${PN} += "ghc-blaze-builder-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-text-2.0.2"

inherit rpm
