SUMMARY = "Haskell Glob profiling library"
DESCRIPTION = "This package provides the Haskell Glob profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-prof-0.10.2-3.8.aarch64.rpm"
RPM_HASH = "230f5ad631fc3cd05c20a793d1c5414434f250aab15b05539ba1b586cbbd567001eb75a1e1d4e22133a03c8d50a1c91c7a9cb5ed9434cac4df7f8d5d63354dc3"

RPROVIDES:${PN} += "ghc-Glob-prof \
ghc-prof-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc"

RDEPENDS:${PN} += "ghc-Glob-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
