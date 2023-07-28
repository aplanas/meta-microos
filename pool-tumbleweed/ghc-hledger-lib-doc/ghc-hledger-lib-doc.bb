SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-3.2.noarch.rpm"
RPM_HASH = "26d0c834bc6a633bdef1eaeb20e7c203d53020aa3b026abf695d914a99589baa6b38e7107c567b403ceda5af6e037f2ca110a373e504a8fe1326dbac8687b3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
