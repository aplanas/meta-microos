SUMMARY = "Haskell megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell megaparsec profiling library."
LICENSE = "BSD-2-Clause"

PV = "9.3.0"

RPM_NAME = "ghc-megaparsec-prof-9.3.0-1.3.aarch64.rpm"
RPM_HASH = "df6b5d24d8b17e9c174c3907198dd087ccad2c724cf4e2497be1ecbfe8eb30b7736ae017bd2a611c86294560afd8019a2bc0025387fd60be7147ec95c6a774f3"

RPROVIDES:${PN} += "ghc-megaparsec-prof ghc-megaparsec-prof(aarch-64) ghc-prof(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv)"
RDEPENDS:${PN} += "ghc-megaparsec-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(mtl-2.2.2) ghc-prof(parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt) ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2)"

inherit rpm
