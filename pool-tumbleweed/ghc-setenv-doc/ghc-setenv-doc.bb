SUMMARY = "Haskell setenv library documentation"
DESCRIPTION = "This package provides the Haskell setenv library documentation."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-doc-0.1.1.3-12.3.noarch.rpm"
RPM_HASH = "18bc3b09cadb85962e2d0f6ff56ade26f54b22f7759adf7a209943051fb5e3ab43c715ad28eeeb6c1e3414b261c0dcbf6acbeffd43979a9171f60d2811cadaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setenv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
