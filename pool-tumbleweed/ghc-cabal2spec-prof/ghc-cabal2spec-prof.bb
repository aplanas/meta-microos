SUMMARY = "Haskell cabal2spec profiling library"
DESCRIPTION = "This package provides the Haskell cabal2spec profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-prof-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "2c9cc9128eea71ff70418645c1965b55f55541f412659f487653b20641ada2c0f7fafc736b48898b9918a73d8d564659c3de32ca1b837d6e19260d9d5e911a15"

RPROVIDES:${PN} += "ghc-cabal2spec-prof \
ghc-prof-cabal2spec-2.7.0-54mL96TvGMU9RbanaGRqP2"

RDEPENDS:${PN} += "ghc-cabal2spec-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2"

inherit rpm
