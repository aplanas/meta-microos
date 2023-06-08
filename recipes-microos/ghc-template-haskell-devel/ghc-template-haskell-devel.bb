SUMMARY = "Haskell template-haskell library development files"
DESCRIPTION = "This package provides the Haskell template-haskell library development files."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-devel-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "48a328e4d574a3897e02789a3eb379c5ef3c60fb73cbe94addbe40e754955fb7825a8c841c67b77ea4f4d0e6ea38c17c8c78d8ace224f4f419021d6b15dcaf56"

RPROVIDES:${PN} += "ghc-devel(template-haskell-2.19.0.0) ghc-template-haskell-devel ghc-template-haskell-devel(aarch-64) ghc-template-haskell-static ghc-template-haskell-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(ghc-boot-th-9.4.5) ghc-devel(ghc-prim-0.9.0) ghc-devel(pretty-1.1.3.6) ghc-template-haskell(aarch-64)"

inherit rpm
