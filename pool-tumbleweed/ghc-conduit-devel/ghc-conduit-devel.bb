SUMMARY = "Haskell conduit library development files"
DESCRIPTION = "This package provides the Haskell conduit library development files."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-devel-1.3.5-1.3.aarch64.rpm"
RPM_HASH = "99d840d8372f9a7743cc6f9728cbc18eb9bb4d87ee2da8abcd571f3b349cc71f60b25ae2bf77f25497ab3634f38836dd8955190e6c00436ae996973ba058cf34"

RPROVIDES:${PN} += "ghc-conduit-devel \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-conduit \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S \
ghc-devel-mtl-2.2.2 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
