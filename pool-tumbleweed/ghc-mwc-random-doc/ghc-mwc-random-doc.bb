SUMMARY = "Haskell mwc-random library documentation"
DESCRIPTION = "This package provides the Haskell mwc-random library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-doc-0.15.0.2-3.8.noarch.rpm"
RPM_HASH = "a7eb1bcb8abe1320f8437cbda187912a0e0d74e248a4460053a6a743ed3462939be530685c0ab97a9c21b04e32b39eefea6752c245d1174a26c9434dcc50addb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mwc-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
