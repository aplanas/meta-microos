SUMMARY = "Haskell gitrev library documentation"
DESCRIPTION = "This package provides the Haskell gitrev library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-doc-1.3.1-9.4.noarch.rpm"
RPM_HASH = "318d1ef38e9e8289fef9f7db2c80dc6735e237e839f1269eb3c30d49d96bdcf196c2b24b71166f97269136035a6242a2e01cd102875801651c0db87e0fc0117b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gitrev-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
