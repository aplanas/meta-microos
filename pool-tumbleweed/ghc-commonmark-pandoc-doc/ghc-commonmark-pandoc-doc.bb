SUMMARY = "Haskell commonmark-pandoc library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-doc-0.2.1.3-2.2.noarch.rpm"
RPM_HASH = "75d67680747f5ef9e6702354fc5d0ba0f36253491d5f4fa56952e7e6abb97b590afc09fad603b6283700aa832d3cc93de59fa8788361586570124a710a8211c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
