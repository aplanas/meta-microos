SUMMARY = "Haskell cereal library development files"
DESCRIPTION = "This package provides the Haskell cereal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-devel-0.5.8.3-2.3.aarch64.rpm"
RPM_HASH = "e1ddfa3071222beb9be539210e0e50fc0ec251fadf01aea07145654d9e77d70abaa263e7a12ea30c057d68b2c9c49c6df779ddb9e031d32de66035706de9950b"

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
