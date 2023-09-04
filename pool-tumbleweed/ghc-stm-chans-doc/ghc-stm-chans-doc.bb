SUMMARY = "Haskell stm-chans library documentation"
DESCRIPTION = "This package provides the Haskell stm-chans library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-doc-3.0.0.9-1.8.noarch.rpm"
RPM_HASH = "dca0d02db65d034e3614d34b92a6b9eadb89e43477e1cb0aff72c99387512a757687315d1a9a93d7f9fc343677ae941c0afe952f89e02ec4bab073f74e7b73ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-chans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
