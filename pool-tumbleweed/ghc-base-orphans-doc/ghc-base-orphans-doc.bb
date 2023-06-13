SUMMARY = "Haskell base-orphans library documentation"
DESCRIPTION = "This package provides the Haskell base-orphans library documentation."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-doc-0.8.8.2-1.2.noarch.rpm"
RPM_HASH = "f28f1efde6e1d61a91a9b5353f7dc0b2b9adc1ba5e79289682dd52b4ec8f5ab5f82997dda29ab18f12837dbe287ce8909ef6b7059ef8a82c4a45e9f2e75b9eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-orphans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
