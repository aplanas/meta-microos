SUMMARY = "Haskell HsYAML profiling library"
DESCRIPTION = "This package provides the Haskell HsYAML profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-prof-0.2.1.1-6.1.aarch64.rpm"
RPM_HASH = "c9c8f1f9caae3b155715dafd27d9c773ce110cd462d7e25e89c32558530458710f177084bee67eb28d11c5008bb6a616fc3fbf7c61a0a3d44f883d39bb1b88b8"

RPROVIDES:${PN} += "ghc-HsYAML-prof \
ghc-prof-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ"

RDEPENDS:${PN} += "ghc-HsYAML-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
