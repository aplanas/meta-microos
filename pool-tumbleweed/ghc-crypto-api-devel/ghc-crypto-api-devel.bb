SUMMARY = "Haskell crypto-api library development files"
DESCRIPTION = "This package provides the Haskell crypto-api library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-devel-0.13.3-5.6.aarch64.rpm"
RPM_HASH = "1b42669afe0d39f33295f93ac1a0e4bb0a0395b44cb31c153b2c79df3c08ae746c712e88a5847fec23522ee23e713878bd1739a4ccba03b262ed4ec73813dc48"

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
