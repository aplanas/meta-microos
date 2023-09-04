SUMMARY = "Haskell cabal2spec library development files"
DESCRIPTION = "This package provides the Haskell cabal2spec library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-devel-2.7.0-1.5.aarch64.rpm"
RPM_HASH = "86bbf8be7aa8035ea047d0a40b9dbb44b0c2ccb615182379ae814ca488a892b4e7e79c114ad799b2c48c08a730dd0cc5dd667774179a855eb0f0c3b39ab533ac"

RPROVIDES:${PN} += "ghc-cabal2spec-devel \
ghc-devel-cabal2spec-2.7.0-8dWbD7pVkXo1xhNArKyBtJ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal2spec \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2"

inherit rpm
