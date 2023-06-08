SUMMARY = "Haskell array library development files"
DESCRIPTION = "This package provides the Haskell array library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-devel-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "63ee2d698290e18d837e61dc166ec01aeda7db8cbe5a2d73b77ee942bbf897097748bfd7c872bff89699a5ffec862a836ae08757a16a52534f2a17f5ffe7c4b6"

RPROVIDES:${PN} += "ghc-array-devel ghc-array-devel(aarch-64) ghc-array-static ghc-array-static(aarch-64) ghc-devel(array-0.5.4.0)"
RDEPENDS:${PN} += "ghc-array(aarch-64) ghc-compiler ghc-devel(base-4.17.1.0)"

inherit rpm
