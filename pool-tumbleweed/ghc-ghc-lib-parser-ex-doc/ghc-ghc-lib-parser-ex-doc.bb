SUMMARY = "Haskell ghc-lib-parser-ex library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-doc-9.4.0.0-1.11.noarch.rpm"
RPM_HASH = "c404d0bd7da307b3e2888d340da5e91b6368e6a84cf446d7e9d7f9f1736f1494cc46cddc38d290bf1252038c98ca1f090fe3bd230d8a3c441372dc7082622b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
