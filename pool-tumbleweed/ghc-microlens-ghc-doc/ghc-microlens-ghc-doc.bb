SUMMARY = "Haskell microlens-ghc library documentation"
DESCRIPTION = "This package provides the Haskell microlens-ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-doc-0.4.14.1-2.3.noarch.rpm"
RPM_HASH = "b0d09b0aeb443ae4706aafa3c19515cc70ecd318eb72e9324cefbaecdb5f111d30495b685ba62b6450345883eeb20c6b332f0f46ba743498170b02d5a4682c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
