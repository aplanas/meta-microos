SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.16.noarch.rpm"
RPM_HASH = "9e71f3be1b74bce757b0c09f2bd3259eeb773360722a35c4507d0240b7c82a273e0ab9c1b5d86e13865d04e9bdf3487a8820d429ed24bfa50ef084df63f50e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
