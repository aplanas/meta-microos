SUMMARY = "Haskell Diff library documentation"
DESCRIPTION = "This package provides the Haskell Diff library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-doc-0.4.1-2.8.noarch.rpm"
RPM_HASH = "cec866da52c4705f71c415586b554a0bca015fbf2284ee3bbe0aa6cabf69654038bf40361fba1f67ceb21672e0b28a1be28c57d88e00ba08c0a7fb79f31271c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Diff-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
