SUMMARY = "Haskell tasty-quickcheck library documentation"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library documentation."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-doc-0.10.2-2.3.noarch.rpm"
RPM_HASH = "88240ec9dc7321e7be93bf2cb48e464d005bd96ed2c860eb04114a0fd89c7cfa2fc8bcf4a97f007cf6ca35aac0ba9a5527b7be89526b25cd61a249e6eac486e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-quickcheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
