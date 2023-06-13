SUMMARY = "Haskell time-locale-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-locale-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-doc-0.1.1.5-7.2.noarch.rpm"
RPM_HASH = "93c4083802dd9c6ed24147e7409ae49eab90bbebc28819c82050898bf5eee15036668a9dbd48ad62091dd00dddd778dd0fdb26dea3accf92bb9ba75673b0d230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-locale-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
