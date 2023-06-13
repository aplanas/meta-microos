SUMMARY = "Haskell parsec-numbers library documentation"
DESCRIPTION = "This package provides the Haskell parsec-numbers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-doc-0.1.0-7.2.noarch.rpm"
RPM_HASH = "cecfcfc8799cc41165c72a6b67d6cfb88466b866ce45a6d9a0173c8ea6b83ef69935b17b499a0982316843e7419cccb02add93a4f77c39947d749c73d27ddef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-numbers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
