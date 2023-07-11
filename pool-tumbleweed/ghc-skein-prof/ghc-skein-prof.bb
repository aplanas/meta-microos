SUMMARY = "Haskell skein profiling library"
DESCRIPTION = "This package provides the Haskell skein profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-prof-1.0.9.4-4.3.aarch64.rpm"
RPM_HASH = "34c63dea9b069e0b1c2a61398825a5c173173bd45054bed06db2222b8066807ad16a9fb7b0e55de5050e14d1a3fb8899abbdf49a6939a951ac70d84b032c7463"

RPROVIDES:${PN} += "ghc-prof-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-skein-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-skein-devel"

inherit rpm
