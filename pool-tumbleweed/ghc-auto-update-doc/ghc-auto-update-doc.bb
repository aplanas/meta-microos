SUMMARY = "Haskell auto-update library documentation"
DESCRIPTION = "This package provides the Haskell auto-update library documentation."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-doc-0.1.6-6.8.noarch.rpm"
RPM_HASH = "e1cf56e1b8e5d26dd19b97978b430d7053011dceece8dc358a25c42a031fe6bf49a895b2c75f2110f8dd5e024500089615b74654c1695dfe19939776e61d9545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-auto-update-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
