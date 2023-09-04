SUMMARY = "Haskell language-javascript library documentation"
DESCRIPTION = "This package provides the Haskell language-javascript library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-doc-0.7.1.0-4.8.noarch.rpm"
RPM_HASH = "e86998d7f0d1c37c3aa87f263a838f1be52dcc110c35c2cfb1ec4680a91bdd854251e13b892b73844f428fd964db36208fa59569c3d4baa16772ecce8029febf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-javascript-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
