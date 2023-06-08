SUMMARY = "Haskell syb library documentation"
DESCRIPTION = "This package provides the Haskell syb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.3"

RPM_NAME = "ghc-syb-doc-0.7.2.3-1.2.noarch.rpm"
RPM_HASH = "826ca0206f1532f56f528e577a9789470deee418d92f632357d0a342db7b019de7dd488b69cb5f4f9cda395e55111a00f6f7d0e18b75153a2e60844d5ac97014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-syb-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
