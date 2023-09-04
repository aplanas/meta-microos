SUMMARY = "Haskell text-conversions library documentation"
DESCRIPTION = "This package provides the Haskell text-conversions library documentation."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-doc-0.3.1.1-2.3.noarch.rpm"
RPM_HASH = "e6ce5f11a245d090949d8e10ef7cbf6d528c18dade797c5fe5eca6384f0b5adfdd893c30e26ee9de41c423e89ba4d561491958a3e15181f99394a19d374b892e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-conversions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
