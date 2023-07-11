SUMMARY = "Haskell cabal-install library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-doc-3.8.1.0-1.7.noarch.rpm"
RPM_HASH = "3b019f76a2233c81af6c3c5d8ea30c5e659d1532842bb8778fc8818a14bf2919bc9c849f922a526d2f51dcddd18d2a64ef0ba2bad48f352fc3aae46bd4688dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
