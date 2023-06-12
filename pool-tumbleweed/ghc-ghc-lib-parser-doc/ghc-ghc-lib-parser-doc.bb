SUMMARY = "Haskell ghc-lib-parser library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.4.20221225"

RPM_NAME = "ghc-ghc-lib-parser-doc-9.4.4.20221225-1.3.noarch.rpm"
RPM_HASH = "9101a196655f5264fa54ec47035fdcf72258c6cde38a79aa6479aa79d649c53c9e9bcdd3997db86fe841fd1136a5d9eac3fbb96cedebfb6ef5ccc5babdc8a335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
