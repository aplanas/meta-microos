SUMMARY = "Haskell haddock-library profiling library"
DESCRIPTION = "This package provides the Haskell haddock-library profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-prof-1.11.0-2.3.aarch64.rpm"
RPM_HASH = "612d3ee7b890fd9d78789de4032d2b8cefcd0298fb776245e8f7c68af86138115936312e90e7593e6855d5f6e9f9f465c9f35e291f780f8ef1bde1de03531de0"

RPROVIDES:${PN} += "ghc-haddock-library-prof \
ghc-haddock-library-prof(aarch-64) \
ghc-prof(haddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs)"

RDEPENDS:${PN} += "ghc-haddock-library-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(text-2.0.2)"

inherit rpm
