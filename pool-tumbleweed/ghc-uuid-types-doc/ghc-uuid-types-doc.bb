SUMMARY = "Haskell uuid-types library documentation"
DESCRIPTION = "This package provides the Haskell uuid-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-doc-1.0.5-5.2.noarch.rpm"
RPM_HASH = "c544b9fa2fc71239694729cfdad3d3ac7c63410b2fabd6d10b5c11c725005d3bd383c8e8daa0f396a0afb5a3b57fea651c9abf9b41d734005ad69836eda16002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-types-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
