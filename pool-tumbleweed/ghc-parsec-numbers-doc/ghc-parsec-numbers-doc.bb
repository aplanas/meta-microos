SUMMARY = "Haskell parsec-numbers library documentation"
DESCRIPTION = "This package provides the Haskell parsec-numbers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-doc-0.1.0-7.3.noarch.rpm"
RPM_HASH = "f88cfd19c0f0f05bfa02cab4d295befa744716e861d7ebd997543e3be7a487a69d680cb072950b155735f29671c6ace59407c0c87d5f2cf4d8740eb60a1ae985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-numbers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
