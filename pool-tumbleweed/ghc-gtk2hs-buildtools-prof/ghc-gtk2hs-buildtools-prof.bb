SUMMARY = "Haskell gtk2hs-buildtools profiling library"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools profiling library."
LICENSE = "GPL-2.0-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-gtk2hs-buildtools-prof-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "4917e6fdc4e4603725b7e81eb8fd0b7473e341dea6a26e1e6e68c103377da750cdf83157f96a3904407b2acbb0e8d1f936dc6a3e54665001561d36e6e9926dd3"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-prof \
ghc-prof-gtk2hs-buildtools-0.13.10.0-GMmATWROlNJH1zTcL3EPcc"

RDEPENDS:${PN} += "ghc-gtk2hs-buildtools-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o"

inherit rpm
