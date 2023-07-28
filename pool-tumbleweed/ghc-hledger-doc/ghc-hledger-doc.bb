SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-3.2.noarch.rpm"
RPM_HASH = "bb6f4db8e0fac48d4ad7f0336f07f22c15fcb88ade33a3491c4b002ffd00ba254ed3ae5b13d49d2811f626a9064f867635e7495d2d0b97bf3c386de5a7d6b895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
