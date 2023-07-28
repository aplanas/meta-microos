SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.5.noarch.rpm"
RPM_HASH = "ec0242bf485892d02936b9e6df110c50e7bbe28ecf8dd68b9e338a57310f5c664b3c0a4541e992ef6cb416071ed9facac73f43e493cb34929e00534c80b2e96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
