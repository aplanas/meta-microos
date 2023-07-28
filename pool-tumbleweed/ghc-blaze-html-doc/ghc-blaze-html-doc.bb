SUMMARY = "Haskell blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-doc-0.9.1.2-9.1.noarch.rpm"
RPM_HASH = "9010e91f6416e04cd5e93fcf76fe648a17999d77a1562a32c95c2c0d4252e8c813a2a13ca04bb7caf4fd116c039153ea36cf3bc4188e5189ea05177312e49413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
