SUMMARY = "Haskell crypto-api profiling library"
DESCRIPTION = "This package provides the Haskell crypto-api profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-prof-0.13.3-5.6.aarch64.rpm"
RPM_HASH = "c5d71d6fd3290e14d4b524b8bed01f5815262a7d4e90e4457bfc44c392655baaa8520a7e6552d567c0eceb3a4f718c3fa9ee540c6420c1756d90c17695a58d93"

RPROVIDES:${PN} += "ghc-crypto-api-prof \
ghc-prof-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE"

RDEPENDS:${PN} += "ghc-crypto-api-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-transformers-0.5.6.2"

inherit rpm
