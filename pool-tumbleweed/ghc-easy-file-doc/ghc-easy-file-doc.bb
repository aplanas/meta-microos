SUMMARY = "Haskell easy-file library documentation"
DESCRIPTION = "This package provides the Haskell easy-file library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-doc-0.2.5-1.5.noarch.rpm"
RPM_HASH = "df1bbf28dd8c3350a0d36f678afc0fcc47a240d53b16577192de5656f12bdf33cdc26e4a774859a6847ca4af13a6d904ef51a64b9c44c67c168d38235685133a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-easy-file-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
