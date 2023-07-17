SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.2.3-2.1.noarch.rpm"
RPM_HASH = "d905f0207d9ff7c22cb83f1031400ca048c3b5f26dd84b69b4eae4a1ba3f2bb3d17b59227ade6cc633de4b4240ae66881a83f2879e4a922b882e8ba4f5d0bb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
