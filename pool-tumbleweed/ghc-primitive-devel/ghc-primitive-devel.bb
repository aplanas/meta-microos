SUMMARY = "Haskell primitive library development files"
DESCRIPTION = "This package provides the Haskell primitive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-devel-0.7.4.0-1.8.aarch64.rpm"
RPM_HASH = "f6a98b5248b39776ae128997257c29bfac888813cb12afe6fd3408ffa32e245392e6721dfc9d6ff1edb9213943c1c9e4580f614653ee232028bd5d68e5d4b7f2"

RPROVIDES:${PN} += "ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-primitive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-primitive"

inherit rpm
