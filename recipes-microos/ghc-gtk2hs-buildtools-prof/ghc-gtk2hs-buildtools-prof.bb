SUMMARY = "Haskell gtk2hs-buildtools profiling library"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools profiling library."
LICENSE = "GPL-2.0-only"

PV = "0.13.8.3"

RPM_NAME = "ghc-gtk2hs-buildtools-prof-0.13.8.3-2.3.aarch64.rpm"
RPM_HASH = "ad466fa1c0d70bdb747b49420b2a5a4cce91cf5c085ac3825456964d403da711b3dbfb29c6e7b0ab28c0df9dc2cf2b7cc09cbf2284c4e3f584bb6f4d020719fe"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-prof \
ghc-gtk2hs-buildtools-prof(aarch-64) \
ghc-prof(gtk2hs-buildtools-0.13.8.3-1HEgD6xsgMLLqS6Eg0gkhE)"
RDEPENDS:${PN} += "ghc-gtk2hs-buildtools-devel \
ghc-prof(Cabal-3.8.1.0) \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p) \
ghc-prof(pretty-1.1.3.6) \
ghc-prof(process-1.6.16.0) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o)"

inherit rpm
