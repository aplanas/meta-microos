SUMMARY = "Haskell exceptions profiling library"
DESCRIPTION = "This package provides the Haskell exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-prof-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "58b76d2e601ea3aa8c052eb5377aa5545a5ca218825d776d9116200310b2985d265df0ba2e8836c000e49504cc9fb2a0b779457df852d7440d77427d87c8d28e"

RPROVIDES:${PN} += "ghc-exceptions-prof \
ghc-prof-exceptions-0.10.5"

RDEPENDS:${PN} += "ghc-exceptions-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
