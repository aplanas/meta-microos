SUMMARY = "Haskell cabal2spec library development files"
DESCRIPTION = "This package provides the Haskell cabal2spec library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-devel-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "f1b6c8da38184472d124601dd1e464f7b851fcfbab69a7a39aca2f213fb7659d1cc1dca3373adc1ba62b29dfc11ca6f83e593ae60f3d7571aae9749bdab78278"

RPROVIDES:${PN} += "ghc-cabal2spec-devel \
ghc-devel-cabal2spec-2.7.0-54mL96TvGMU9RbanaGRqP2"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal2spec \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2"

inherit rpm
