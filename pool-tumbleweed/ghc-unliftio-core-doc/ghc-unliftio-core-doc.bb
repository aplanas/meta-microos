SUMMARY = "Haskell unliftio-core library documentation"
DESCRIPTION = "This package provides the Haskell unliftio-core library documentation."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-doc-0.2.1.0-1.8.noarch.rpm"
RPM_HASH = "41a03523478c6583f7e2608329655cb38b3bf61e88c3d62697fc8cd175bfbc4b4c6a0185823a5797318b886ccc391f1b7e4b1296d89e90a0a4d4a7a675d7986b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
