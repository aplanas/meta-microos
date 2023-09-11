SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.18.noarch.rpm"
RPM_HASH = "90e3530779cc578790a5dd7f10d810a66e476cff94204fe595df2cde75fe8f130dac0a864da480bc8c61306d12d6585328491f293ae290afdfb0bd2b52cfaaf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
