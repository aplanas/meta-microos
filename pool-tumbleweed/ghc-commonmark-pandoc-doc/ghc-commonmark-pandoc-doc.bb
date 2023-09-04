SUMMARY = "Haskell commonmark-pandoc library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-doc-0.2.1.3-2.10.noarch.rpm"
RPM_HASH = "a642ade998614af4f3c5879bd19bfd02a2d15d217c78f08d4b8834a944b207ed46f814825cbb12b4f87207838a8f1d467e3fdd9d17e623ece3954d2714283712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
