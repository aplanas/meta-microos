SUMMARY = "Haskell pandoc-types library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-types library documentation."
LICENSE = "GPL-2.0-only"

PV = "1.23.0.1"

RPM_NAME = "ghc-pandoc-types-doc-1.23.0.1-1.1.noarch.rpm"
RPM_HASH = "c661cae67e50e9ca8ba4d655b8fe4f304966d8109f5b82f39939b3ee92918b210b048779b762b96e22bc9ebfd3972d847694e10d4caf71310dcf0d5b6244da0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
