SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.14.5.0"

RPM_NAME = "ghc-persistent-doc-2.14.5.0-1.7.noarch.rpm"
RPM_HASH = "683a04e2447434213eed4ee8f2e8fc50491a9ab41cc82888fba20a35cd1b2f517b6a109fbd470a9f544532f5cc40f021ba03cb6a7c83b4c38737bf5a4263b5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
