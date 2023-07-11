SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-doc-0.19.1-2.6.noarch.rpm"
RPM_HASH = "7d771d6a4966a34de2ddb7157da133d914c9511f18f55cdfccc1289aaf92a1f9ef7f0f9a4004f6c94847cc6cb088fc32bf586f4ffbcf329c8551b32d479e3ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
