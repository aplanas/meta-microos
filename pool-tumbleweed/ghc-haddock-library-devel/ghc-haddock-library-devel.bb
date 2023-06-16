SUMMARY = "Haskell haddock-library library development files"
DESCRIPTION = "This package provides the Haskell haddock-library library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-devel-1.11.0-2.3.aarch64.rpm"
RPM_HASH = "f2578977202b4d89de8597c942873965f79f8f1d32cc55d23da0b33557d335c523534d85bbd36c3fc28d05c5c77b8f802bc8634ace2dcd0cf48e8d4cd63a5c92"

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
