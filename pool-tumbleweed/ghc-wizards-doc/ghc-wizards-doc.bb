SUMMARY = "Haskell wizards library documentation"
DESCRIPTION = "This package provides the Haskell wizards library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-doc-1.0.3-6.5.noarch.rpm"
RPM_HASH = "b57dd7b3d9c4b7c2381db6b965cde1794ae6d65ca6536c8659ce3c51f6eb84bd1c312803fc353b6f6caa8e83a45201858d1a4813ff6fa65edb38cd3aae31bc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wizards-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
