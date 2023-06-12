SUMMARY = "Haskell crypto-api profiling library"
DESCRIPTION = "This package provides the Haskell crypto-api profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-prof-0.13.3-5.3.aarch64.rpm"
RPM_HASH = "3ac4a8b8fa24767db847ca9c413c3aa6f681bdad1f933fd5b97abd0e8acee53c1649af3a920e7a9549081e4c2ee0e6abad4db7a14173c9444a20632fc60464e2"

RPROVIDES:${PN} += "ghc-crypto-api-prof \
ghc-crypto-api-prof(aarch-64) \
ghc-prof(crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE)"
RDEPENDS:${PN} += "ghc-crypto-api-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-prof(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
