SUMMARY = "Haskell HTTP library documentation"
DESCRIPTION = "This package provides the Haskell HTTP library documentation."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-doc-4000.4.1-1.7.noarch.rpm"
RPM_HASH = "01f96ca5f0d8dea3c2fc055d24f455ca55cf5c52b885bd2fd75c4657e0b515c9f55603e35da1f8e81fff6aef3e4a970a422d0ea6d5e9aeb15a9824148c3477fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HTTP-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
