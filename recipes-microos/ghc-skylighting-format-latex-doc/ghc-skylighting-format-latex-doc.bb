SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.3.noarch.rpm"
RPM_HASH = "b8d620c023407e04b38b5e01c595283581d893d6ee73c22d7a287cb0fbb7f62bf38924691ab78b9cc01d90b844874a9e90061dac267133d273528edb3c3e576f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
