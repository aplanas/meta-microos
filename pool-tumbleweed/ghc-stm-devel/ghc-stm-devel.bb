SUMMARY = "Haskell stm library development files"
DESCRIPTION = "This package provides the Haskell stm library development files."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-devel-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "9561c0d223afc74cc9877aa0b7edb940601644e812488cfc2aff58280da4150a52fd9aea28688f1114c76a7b792553b65dfe3168b568f2c906b31a5cbb7331d2"

RPROVIDES:${PN} += "ghc-devel-stm-2.5.1.0 \
ghc-stm-devel \
ghc-stm-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-stm"

inherit rpm
