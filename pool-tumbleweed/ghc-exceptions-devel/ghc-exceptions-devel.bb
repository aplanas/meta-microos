SUMMARY = "Haskell exceptions library development files"
DESCRIPTION = "This package provides the Haskell exceptions library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-devel-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "c4481d3568bdb775d2a7c87a88d5c07e9ed47b9bd0d39423d6d247a7861c8615d006c07f01e958288c7ea3edfba2816036a4b734d91c718891ac033ee415d8cf"

RPROVIDES:${PN} += "ghc-devel-exceptions-0.10.5 \
ghc-exceptions-devel \
ghc-exceptions-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-exceptions"

inherit rpm
