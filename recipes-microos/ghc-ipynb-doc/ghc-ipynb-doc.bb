SUMMARY = "Haskell ipynb library documentation"
DESCRIPTION = "This package provides the Haskell ipynb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-doc-0.2-2.2.noarch.rpm"
RPM_HASH = "85fce5691e753124c900d292dd46143b323c3ecfc53e59e89f4e8121df32365b137568d7083a3d859410ef6c2d6985505b567942dbcf3ef8e41a5f6576b14fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ipynb-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
