SUMMARY = "Haskell hashable library development files"
DESCRIPTION = "This package provides the Haskell hashable library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.3.0"

RPM_NAME = "ghc-hashable-devel-1.4.3.0-1.3.aarch64.rpm"
RPM_HASH = "8f0d01b4e122f1da88c70201bebb86e885ab2c3c6b684d26d035cc9f95b0cff57e811e03499f6eeb91b49d7a9012ebdfe5232fc1da3122438f3eb67fc2e72622"

RPROVIDES:${PN} += "ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-hashable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-text-2.0.2 \
ghc-hashable"

inherit rpm
