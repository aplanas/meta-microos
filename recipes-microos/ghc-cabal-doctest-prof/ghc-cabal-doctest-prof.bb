SUMMARY = "Haskell cabal-doctest profiling library"
DESCRIPTION = "This package provides the Haskell cabal-doctest profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "ghc-cabal-doctest-prof-1.0.9-4.2.aarch64.rpm"
RPM_HASH = "5f1fae5e77b0c28b5ffcacea9d2b9dbb543ed804917925bb66c5b47181328175b063de18ee382e9142dacfad0f6ffa19be3ab9053bdbdee05364cc55aa96bcf3"

RPROVIDES:${PN} += "ghc-cabal-doctest-prof ghc-cabal-doctest-prof(aarch-64) ghc-prof(cabal-doctest-1.0.9-E4yWN7tR5mMItu3qIh0oSF)"
RDEPENDS:${PN} += "ghc-cabal-doctest-devel ghc-prof(Cabal-3.8.1.0) ghc-prof(base-4.17.1.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2)"

inherit rpm
