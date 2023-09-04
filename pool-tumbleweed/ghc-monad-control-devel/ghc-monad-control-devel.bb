SUMMARY = "Haskell monad-control library development files"
DESCRIPTION = "This package provides the Haskell monad-control library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-devel-1.0.3.1-2.3.aarch64.rpm"
RPM_HASH = "e2b71ff390b09cf90138521c9296afd89c70b4fad02537813243d9dab4a3981e20b5da011082602803db0e0bd3ca906277aae7979cd4007872138ad64f305523"

RPROVIDES:${PN} += "ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-monad-control-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-monad-control"

inherit rpm
