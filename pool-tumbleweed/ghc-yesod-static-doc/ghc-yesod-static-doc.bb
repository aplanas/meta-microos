SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.4.noarch.rpm"
RPM_HASH = "0dcd4fd090c4b5bc3ec172ee90ad7366fad0d0f719335e500953160c94038c1abb01816b9f3a14571afe0b9e7261f9683126a8a2d6b6560d66eee6261dce05ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
