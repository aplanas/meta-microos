SUMMARY = "Haskell ipynb library documentation"
DESCRIPTION = "This package provides the Haskell ipynb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-doc-0.2-2.6.noarch.rpm"
RPM_HASH = "d922e10d7dd1a310e1cc3f2fc494beccfbfdbf5920ac2ff539f20d0ecb848e5f243498395d86715c16fd7e518498508ff580f46928d976739bf5535765e9ec07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ipynb-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
