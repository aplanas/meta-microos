SUMMARY = "Haskell blaze-builder library development files"
DESCRIPTION = "This package provides the Haskell blaze-builder library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.3"

RPM_NAME = "ghc-blaze-builder-devel-0.4.2.3-1.1.aarch64.rpm"
RPM_HASH = "d17b8d9ce2ab78b8ebdd1468232cdc6ceedf4f44ca7ff2a9fe1077f20ef9fe025ec4005c1ef420cb9b53cf5f5df388f280971ac391e5233c44fda2cf3f53ee2c"

RPROVIDES:${PN} += "ghc-blaze-builder-devel \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-builder \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-text-2.0.2"

inherit rpm
