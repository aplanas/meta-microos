SUMMARY = "Haskell haddock-library library development files"
DESCRIPTION = "This package provides the Haskell haddock-library library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-devel-1.11.0-2.6.aarch64.rpm"
RPM_HASH = "fa52a019be6a9e12b9a4c46d5b88376fe2045ec02364bd7ebb84699bdf0b8082a09d5a7a8b2ee6f5d7d7d873c5b20a8ffb841e89712f63dbc684a9652582a668"

RPROVIDES:${PN} += "ghc-devel-haddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs \
ghc-haddock-library-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-haddock-library"

inherit rpm
