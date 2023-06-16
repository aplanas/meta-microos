SUMMARY = "Haskell criterion-measurement library development files"
DESCRIPTION = "This package provides the Haskell criterion-measurement library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-devel-0.2.1.0-1.2.aarch64.rpm"
RPM_HASH = "8f84c9a2c576992bd306bbd63957f0667ab67aa4b1c63b4164f6e1478ceb9744f206ba87259508e97c3fa0a5cf45cf690a06dad86c89f0edcf15a5bff6f26020"

RPROVIDES:${PN} += "ghc-criterion-measurement-devel \
ghc-devel-criterion-measurement-0.2.1.0-87nlGOXoqxrBN5mUt0bPv1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-criterion-measurement \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
