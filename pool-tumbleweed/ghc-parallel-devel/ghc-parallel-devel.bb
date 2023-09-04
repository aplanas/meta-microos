SUMMARY = "Haskell parallel library development files"
DESCRIPTION = "This package provides the Haskell parallel library development files."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-devel-3.2.2.0-12.8.aarch64.rpm"
RPM_HASH = "ad58c05031e367e53a9c294c9771d61a5b57ceeaa9e54244c0d30713d9caec8a7344bd8836329eb96a0bf34ec5f3de18f51b353f0ad0418d363ad79b6db5b2bf"

RPROVIDES:${PN} += "ghc-devel-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-parallel-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-parallel"

inherit rpm
