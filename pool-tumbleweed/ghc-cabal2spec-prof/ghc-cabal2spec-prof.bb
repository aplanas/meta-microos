SUMMARY = "Haskell cabal2spec profiling library"
DESCRIPTION = "This package provides the Haskell cabal2spec profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-prof-2.7.0-1.2.aarch64.rpm"
RPM_HASH = "5c0e498bd9dfe9f10b35adfb9afd2c830774f86b94476f8ce1cb158c1cf403bf58cf8dca538575b5b5971348548e770303459cd4c48b45efffe3d79cfaf3d87e"

RPROVIDES:${PN} += "ghc-cabal2spec-prof \
ghc-cabal2spec-prof(aarch-64) \
ghc-prof(cabal2spec-2.7.0-9ijIHSPt0QmI4YnWoXNap7)"
RDEPENDS:${PN} += "ghc-cabal2spec-devel \
ghc-prof(Cabal-3.8.1.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(time-1.12.2)"

inherit rpm
