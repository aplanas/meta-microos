SUMMARY = "Haskell tabular library documentation"
DESCRIPTION = "This package provides the Haskell tabular library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-doc-0.2.2.8-4.8.noarch.rpm"
RPM_HASH = "422983ee9fd8c3d29171b36b5ed10ea134ca4778797fe70bd5b6387bc48a62d03d0c684f58a2172369e1b652b592629d2a20e4c4bb5842c05d73c10062832dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tabular-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
