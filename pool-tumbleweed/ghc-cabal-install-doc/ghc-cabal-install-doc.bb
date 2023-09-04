SUMMARY = "Haskell cabal-install library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-doc-3.8.1.0-2.4.noarch.rpm"
RPM_HASH = "83a8e46134cd97b3dd866e4c548cff697c0bcfcf98d82a6c9785171fca5f92df9452a210357eac517d7ef38ba5bf99067842d6fd10a514faacf5bb754677137d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
