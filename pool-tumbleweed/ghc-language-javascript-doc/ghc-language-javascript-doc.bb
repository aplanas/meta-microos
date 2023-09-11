SUMMARY = "Haskell language-javascript library documentation"
DESCRIPTION = "This package provides the Haskell language-javascript library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-doc-0.7.1.0-4.9.noarch.rpm"
RPM_HASH = "5b57066b7d2ef8ebf9263696fec44a6c8a8a1f67c80ff7651b45a11021fec6b394e158ffe4f42b5dcd71497a14026598094b678393ea6c69f30d33d0befde4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-javascript-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
