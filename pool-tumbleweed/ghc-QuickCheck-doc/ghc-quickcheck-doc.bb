SUMMARY = "Haskell QuickCheck library documentation"
DESCRIPTION = "This package provides the Haskell QuickCheck library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.14.2"

RPM_NAME = "ghc-QuickCheck-doc-2.14.2-3.3.noarch.rpm"
RPM_HASH = "93576859ab1b06e29ede5b483900343eff3defde383415f7c2dd00d03730957b22bb74e9be0988f5cd09cda9dc5b65ce6a73ed4dae735a7ff8f718ca58cd70c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-QuickCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
