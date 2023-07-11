SUMMARY = "Haskell cereal library development files"
DESCRIPTION = "This package provides the Haskell cereal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-devel-0.5.8.3-2.6.aarch64.rpm"
RPM_HASH = "3bfea7aaabf0f9876a286a71acacd562b9781894bcfff8beda56950e0f79ba8ee6293d7ddeec3a2cff5aee80750b56c6be04814f22674a5166e8e3c8f80c403a"

RPROVIDES:${PN} += "ghc-cereal-devel \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cereal \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
