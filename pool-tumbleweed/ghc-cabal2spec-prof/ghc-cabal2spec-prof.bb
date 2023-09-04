SUMMARY = "Haskell cabal2spec profiling library"
DESCRIPTION = "This package provides the Haskell cabal2spec profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-prof-2.7.0-1.5.aarch64.rpm"
RPM_HASH = "741eb77377540fe6efbd5f052f1b55a171f2a2a995e099bdf1bbb059249f5860e1ca1b3f5ac7073029247772a3104c31f0eee3020f6cdfde43f6820f6ff4cfc1"

RPROVIDES:${PN} += "ghc-cabal2spec-prof \
ghc-prof-cabal2spec-2.7.0-8dWbD7pVkXo1xhNArKyBtJ"

RDEPENDS:${PN} += "ghc-cabal2spec-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2"

inherit rpm
