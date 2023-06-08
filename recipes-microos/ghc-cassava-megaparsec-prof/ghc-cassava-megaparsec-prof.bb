SUMMARY = "Haskell cassava-megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec profiling library."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-prof-2.0.4-3.2.aarch64.rpm"
RPM_HASH = "b61964adb4e0e3322627a995f487be6f8fddb3335f608fb80b13a23951c58c8fbbb05b5fc31f28334a059a124ba562d0b9da8d135de2132aa387e7049fb154c9"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-prof ghc-cassava-megaparsec-prof(aarch-64) ghc-prof(cassava-megaparsec-2.0.4-2pnivL0ArW7GGP4dYCJwT3)"
RDEPENDS:${PN} += "ghc-cassava-megaparsec-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD) ghc-prof(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
