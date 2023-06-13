SUMMARY = "Haskell semigroups library documentation"
DESCRIPTION = "This package provides the Haskell semigroups library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-doc-0.20-2.2.noarch.rpm"
RPM_HASH = "d27518dbeb4cf976ff13b3e56c02390f747675a357f46ea026c1880942d82ce44c42c71e70360dfe9a3fc1d2a4a4ea1f33ab7bb5b4758d5cb4164840a51c28f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroups-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
