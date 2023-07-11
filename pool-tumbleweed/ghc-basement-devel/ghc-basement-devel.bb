SUMMARY = "Haskell basement library development files"
DESCRIPTION = "This package provides the Haskell basement library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-devel-0.0.16-1.3.aarch64.rpm"
RPM_HASH = "c251d22dfc8d2409a8ea204cac56a3c687371fa580c99cf0988e3afb16f1a89b965b762db886eb519ba791569685242ed82732ed4750e6ef7352885f59de94a4"

RPROVIDES:${PN} += "ghc-basement-devel \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-basement \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
