SUMMARY = "Haskell regex-posix library documentation"
DESCRIPTION = "This package provides the Haskell regex-posix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-doc-0.96.0.1-4.3.noarch.rpm"
RPM_HASH = "a97d56b783a2a6135ad619b54916fa62b78bdaf2dc181056d4d37f55bf627c88d11eee358b0502e1a8d75d0de55e4c9e19889b88c9a097dd178559ea15ab1e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-posix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
