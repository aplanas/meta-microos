SUMMARY = "Haskell typst-symbols library documentation"
DESCRIPTION = "This package provides the Haskell typst-symbols library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-doc-0.1.2-1.3.noarch.rpm"
RPM_HASH = "db5d6a30e62a534d20d83e948fa944215a7dfa2c224b6afa888cc2079a98ece9288a3ec1e15c1ec57637ead9d44ed66c034bf0e150bef71132ab6a6dae432b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
