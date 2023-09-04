SUMMARY = "Haskell cabal-doctest library development files"
DESCRIPTION = "This package provides the Haskell cabal-doctest library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-devel-1.0.9-4.3.aarch64.rpm"
RPM_HASH = "a770833581e653d761187cb7095bd81af76179d8486e97e2a8bcedddd4955b24ce296cb45c5354cca3737132cb3403e3542430684fbcc2d96ed15880de7b360c"

RPROVIDES:${PN} += "ghc-cabal-doctest-devel \
ghc-devel-cabal-doctest-1.0.9-4FGoSiQ39Py47R5SD4NHa8"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-doctest \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2"

inherit rpm
