SUMMARY = "Haskell commonmark-pandoc library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-doc-0.2.1.3-2.5.noarch.rpm"
RPM_HASH = "ad2aa2497b2a0f335c406b0e126c2c2c226ab437466ce10612ea665d66cb34ec35d4c307b85984756c1e1f14972782a55983d65bdd7f649aa687ec0c8aec137d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
