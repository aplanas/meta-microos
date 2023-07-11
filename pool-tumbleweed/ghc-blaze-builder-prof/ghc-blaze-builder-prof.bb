SUMMARY = "Haskell blaze-builder profiling library"
DESCRIPTION = "This package provides the Haskell blaze-builder profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-prof-0.4.2.2-3.6.aarch64.rpm"
RPM_HASH = "1f9a10dc80970864b24a005477d0655b56bd684c213e118d247fa8e5acd1aef5c59def91996fc6753b2face7e54c49ba0c1a2de769b6df0668708c656959d74b"

RPROVIDES:${PN} += "ghc-blaze-builder-prof \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW"

RDEPENDS:${PN} += "ghc-blaze-builder-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-text-2.0.2"

inherit rpm
