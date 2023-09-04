SUMMARY = "Haskell http-api-data library documentation"
DESCRIPTION = "This package provides the Haskell http-api-data library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-doc-0.5-4.4.noarch.rpm"
RPM_HASH = "7f7476e572769ed157d4f7e4f5b56f1b1022e682ef7721fc800e1aec397a5c9dcf983bb1ee4e2d2fa38dc37330dbbc16493c37f11b5a567c36cf0a3ff7831c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-api-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
