SUMMARY = "Haskell haddock-library library documentation"
DESCRIPTION = "This package provides the Haskell haddock-library library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-doc-1.11.0-2.3.noarch.rpm"
RPM_HASH = "7ab8b3ed6c4b38e312278de43d4ee10432aa6d4dcf75009f61a256929444729a438f45d6b7430d2d926f28924d8a5a153a56b8b63e90dcd561f2fa2c6e1a6c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haddock-library-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
