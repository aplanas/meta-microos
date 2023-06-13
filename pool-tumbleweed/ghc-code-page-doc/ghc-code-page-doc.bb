SUMMARY = "Haskell code-page library documentation"
DESCRIPTION = "This package provides the Haskell code-page library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-doc-0.2.1-2.2.noarch.rpm"
RPM_HASH = "2631a74eea6b114658fa53086aee7ba5d68b11d0015449f9fa2a9638af6a3f9a7ed48e63ab360b30f663e2f19ac1e25834a447dcd1a46e8a69ab9709386bec46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-code-page-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
