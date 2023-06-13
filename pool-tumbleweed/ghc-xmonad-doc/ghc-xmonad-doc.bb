SUMMARY = "Haskell xmonad library documentation"
DESCRIPTION = "This package provides the Haskell xmonad library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-doc-0.17.2-1.3.noarch.rpm"
RPM_HASH = "134d1fc8a854a75b3386624696f0cc060e82db8477445ad3ca1399df3484e5ffbce79fbe230cb24947f7b230b543c5cd05cbe0963bdd49b47c515b00d099c176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
