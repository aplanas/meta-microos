SUMMARY = "Haskell vault library documentation"
DESCRIPTION = "This package provides the Haskell vault library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-doc-0.3.1.5-4.9.noarch.rpm"
RPM_HASH = "983729eba2069408974ee58b00af266a877d8cbfd98c42801f5f69c0a60645711ae7c350442faed9feb9899da6f8994bb595ab2a082473c82b88da6e82c57b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vault-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
