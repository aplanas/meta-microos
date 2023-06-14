SUMMARY = "Haskell cabal-doctest library development files"
DESCRIPTION = "This package provides the Haskell cabal-doctest library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-devel-1.0.9-4.2.aarch64.rpm"
RPM_HASH = "ef8744d81d4ae8d57fc54d72dd36b8da2b80e3e675221e487415c7bba4139148d6dd22fb9284989b9053f045ca6c7457819838b315d140ba06a713e8ea1bf8ac"

RPROVIDES:${PN} += "ghc-cabal-doctest-devel \
ghc-devel-cabal-doctest-1.0.9-E4yWN7tR5mMItu3qIh0oSF"

RDEPENDS:${PN} += "/bin/sh \
ghc-cabal-doctest \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2"

inherit rpm
