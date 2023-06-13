SUMMARY = "Haskell bitvec library documentation"
DESCRIPTION = "This package provides the Haskell bitvec library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-doc-1.1.4.0-1.3.noarch.rpm"
RPM_HASH = "310b2defee1d3a4d54269a67156aadfe6d39f64aea7f197f2df990e610ed2bc4cedd0e3c334e3204859cbd8b7c9715d972c96a62ac58bf31895fe5217375c1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bitvec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
