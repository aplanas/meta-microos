SUMMARY = "Haskell parser-combinators library documentation"
DESCRIPTION = "This package provides the Haskell parser-combinators library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-doc-1.3.0-2.3.noarch.rpm"
RPM_HASH = "47fd458bd91f8fb2bd994e6ee99aee9e6ba4ce31505b362bafb0332de6989aafd6557207f9ea1865e8a0c63848d716369a7ecf4e30feea19f8d6b1c746534ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parser-combinators-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
