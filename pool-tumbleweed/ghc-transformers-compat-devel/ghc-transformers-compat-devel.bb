SUMMARY = "Haskell transformers-compat library development files"
DESCRIPTION = "This package provides the Haskell transformers-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-devel-0.7.2-2.8.aarch64.rpm"
RPM_HASH = "1ac97171b500378e68942fd241af08dee49334780da22ed2d5983fc17da848b4affa1b6a39c7f34b93552d825c888365888212c7eec3393607c04f3a24da17de"

RPROVIDES:${PN} += "ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-transformers-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-transformers-0.5.6.2 \
ghc-transformers-compat"

inherit rpm
