SUMMARY = "Haskell xmonad-contrib library documentation"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-doc-0.17.1-3.9.noarch.rpm"
RPM_HASH = "421a73e5fe34328e3e7656e325a3666460c80e98060e017c77f9074ef16032914000df1d9d283b26ff9088ddbe633e4336be5d4f42ae5099c8b0cf409ea3d282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-contrib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
