SUMMARY = "Haskell xml-hamlet library development files"
DESCRIPTION = "This package provides the Haskell xml-hamlet library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-devel-0.5.0.2-2.9.aarch64.rpm"
RPM_HASH = "8e6f411d7d281d09a151747f804249a09c6fb0f65bdbe338887f63d30138d12c39d88faf039134af13c280a9f9527cfe919b4fa50611cc451f7238445af8ca26"

RPROVIDES:${PN} += "ghc-devel-xml-hamlet-0.5.0.2-DXz2ffvxE9vxmXJYBmXu \
ghc-xml-hamlet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-xml-hamlet"

inherit rpm
