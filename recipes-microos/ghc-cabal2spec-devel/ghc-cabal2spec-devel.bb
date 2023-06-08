SUMMARY = "Haskell cabal2spec library development files"
DESCRIPTION = "This package provides the Haskell cabal2spec library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-devel-2.7.0-1.2.aarch64.rpm"
RPM_HASH = "8d2f6890bfd31d4f53a4daf5bda2095caf75c1d7cba640a724eb88216ee2f78a829dca73e62aee7090e55c7d9a0c901a20109453194ede78e57dd50ab3394706"

RPROVIDES:${PN} += "ghc-cabal2spec-devel ghc-cabal2spec-devel(aarch-64) ghc-devel(cabal2spec-2.7.0-9ijIHSPt0QmI4YnWoXNap7)"
RDEPENDS:${PN} += "/bin/sh ghc-cabal2spec ghc-compiler ghc-devel(Cabal-3.8.1.0) ghc-devel(base-4.17.1.0) ghc-devel(filepath-1.4.2.2) ghc-devel(time-1.12.2)"

inherit rpm
