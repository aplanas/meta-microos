SUMMARY = "Haskell mtl library development files"
DESCRIPTION = "This package provides the Haskell mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-devel-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "5a925cdf51aa0136496a5ed8d82d4b096852a669b9822cecdc78b49b4946c87e11275f6ce41407c811e229415194bc6174691bf067a93276c60443a4741548d3"

RPROVIDES:${PN} += "ghc-devel-mtl-2.2.2 \
ghc-mtl-devel \
ghc-mtl-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-mtl"

inherit rpm
