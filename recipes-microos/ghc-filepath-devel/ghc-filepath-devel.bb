SUMMARY = "Haskell filepath library development files"
DESCRIPTION = "This package provides the Haskell filepath library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-devel-1.4.2.2-3.1.aarch64.rpm"
RPM_HASH = "9acf884b7733d797ff6383097b9dd97127beee8251bc798de5801018f52f0be8692a99e265fb2516a09f4ad8e1c87b3466ada2471030b9ba3079e78802a30c1b"

RPROVIDES:${PN} += "ghc-devel(filepath-1.4.2.2) ghc-filepath-devel ghc-filepath-devel(aarch-64) ghc-filepath-static ghc-filepath-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-filepath(aarch-64)"

inherit rpm
