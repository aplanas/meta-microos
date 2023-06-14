SUMMARY = "Haskell blaze-builder profiling library"
DESCRIPTION = "This package provides the Haskell blaze-builder profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-prof-0.4.2.2-3.3.aarch64.rpm"
RPM_HASH = "7d202673c5f286b6c9849a9073f170b1f433367c6975d1b5f920bab95e3686ab1b9a9da0bc31004aa09799f2b2a35c0b73156a30d6d3f722608176de48d589b6"

RPROVIDES:${PN} += "ghc-blaze-builder-prof \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW"

RDEPENDS:${PN} += "ghc-blaze-builder-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-text-2.0.2"

inherit rpm
