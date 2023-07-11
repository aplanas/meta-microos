SUMMARY = "Haskell cabal-install-solver profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install-solver profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-prof-3.8.1.0-1.6.aarch64.rpm"
RPM_HASH = "0a6a5944e3071b90ac494892e6220f3eaa24d718e48906ae527bf42db8f808ad531e8f2055175ddfe8abc586138a26ff4666ab2488c9298d68ba991423a82924"

RPROVIDES:${PN} += "ghc-cabal-install-solver-prof \
ghc-prof-cabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp"

RDEPENDS:${PN} += "ghc-cabal-install-solver-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
