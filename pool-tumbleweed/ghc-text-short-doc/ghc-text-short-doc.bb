SUMMARY = "Haskell text-short library documentation"
DESCRIPTION = "This package provides the Haskell text-short library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-doc-0.1.5-3.8.noarch.rpm"
RPM_HASH = "b15cc65438520689100a0cba47d22991761a6ab82891e4243c35f1256e45b4343e693aecc30a940dd8932af51a6200b71d5bdd43a8cde87e1b9330409772fa39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-short-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
