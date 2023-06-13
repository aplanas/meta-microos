SUMMARY = "Haskell hslua-module-doclayout library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-doc-1.1.0-1.2.noarch.rpm"
RPM_HASH = "01e2f042dee6c1d4ea9cd75f3dc39a150832373db832ecf5082d5ce29770cbc04e7d4cf35906f31b31a59963ac17c5b202991a723db5deb979d2a1d261a3cc7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
