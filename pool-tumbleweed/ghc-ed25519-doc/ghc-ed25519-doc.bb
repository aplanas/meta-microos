SUMMARY = "Haskell ed25519 library documentation"
DESCRIPTION = "This package provides the Haskell ed25519 library documentation."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-doc-0.0.5.0-16.3.noarch.rpm"
RPM_HASH = "a8982699dd147ca0f1a49ac4152c5a21616c16516dfe983298fd4896e5cb139d2a9e8b3d79a15fd968e4e3ce9cee09a1cb64fff46dd696e3562148ace45837f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ed25519-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
