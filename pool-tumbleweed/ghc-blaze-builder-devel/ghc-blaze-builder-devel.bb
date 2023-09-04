SUMMARY = "Haskell blaze-builder library development files"
DESCRIPTION = "This package provides the Haskell blaze-builder library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-devel-0.4.2.2-3.8.aarch64.rpm"
RPM_HASH = "aa7ec7856448c73b91124ccbc44a9ea04a1b2c699654dfc8bbda4f7161d18cca0a8dd8faf8b57f2eb24b7a248e40520ba2c0099fd4179689d2f9c2f185c0689e"

RPROVIDES:${PN} += "ghc-blaze-builder-devel \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-builder \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-text-2.0.2"

inherit rpm
