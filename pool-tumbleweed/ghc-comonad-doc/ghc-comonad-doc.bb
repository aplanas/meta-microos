SUMMARY = "Haskell comonad library documentation"
DESCRIPTION = "This package provides the Haskell comonad library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-doc-5.0.8-3.9.noarch.rpm"
RPM_HASH = "ff6f5bc8683f0691c2299effad3013999b73bb1e981905004d7703c28d258810292d11070df124a91e496b7fc34d9ab7984eb945d6149e3a9ced9e8b0a537638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-comonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
