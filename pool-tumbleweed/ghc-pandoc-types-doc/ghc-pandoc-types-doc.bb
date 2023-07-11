SUMMARY = "Haskell pandoc-types library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-types library documentation."
LICENSE = "GPL-2.0-only"

PV = "1.23"

RPM_NAME = "ghc-pandoc-types-doc-1.23-1.6.noarch.rpm"
RPM_HASH = "5fddfe0d2e81cc9bb9e5ba4edca551d6c1e8be1457d08e6148158872e5220b8f1a899516bcff59b1c0f26a9b4fb2dc454347720ec59bf5d47952773fac59bfb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
