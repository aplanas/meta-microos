SUMMARY = "Haskell crypto-api library development files"
DESCRIPTION = "This package provides the Haskell crypto-api library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-devel-0.13.3-5.3.aarch64.rpm"
RPM_HASH = "846f17a5d3858f0b1f2f3386fb6d10abc85c24f9121a9436ecf52c7cb7618cb8885f907cd81a7efb830b2007102290581b503ddb79b89552f68e487c44595387"

RPROVIDES:${PN} += "ghc-crypto-api-devel \
ghc-devel-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-api \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2"

inherit rpm
