SUMMARY = "Haskell hslua-repl library documentation"
DESCRIPTION = "This package provides the Haskell hslua-repl library documentation."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-doc-0.1.1-1.2.noarch.rpm"
RPM_HASH = "f90ba20e96db4cac79d0df0824a3faff4ef8c63dffd260dcfbddbe691d8d08bac4c0e9538248d43269457fb7d78391ae99b41a4707b6ee881810718a248728f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-repl-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
