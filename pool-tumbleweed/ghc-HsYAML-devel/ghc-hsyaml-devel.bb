SUMMARY = "Haskell HsYAML library development files"
DESCRIPTION = "This package provides the Haskell HsYAML library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-devel-0.2.1.1-6.1.aarch64.rpm"
RPM_HASH = "f53456c8fac47cf35eaa5f6232b63ada23f3aa2abeaf8f3a0bac407d5ad4d5d5416845e516a9b09854714ec15f6fabd91b68e4cd25f5d563a0f1b6f94ef0baa9"

RPROVIDES:${PN} += "ghc-HsYAML-devel \
ghc-devel-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HsYAML \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
