SUMMARY = "Haskell indexed-traversable library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-doc-0.1.2.1-1.3.noarch.rpm"
RPM_HASH = "0702efbb406b5f48376aeeac66ec6068316e9af7de76a417d11eb7e9bb9e4544a5d9ffd97fbdb28867b39f14a8684a0ef4488ce9072ed1ec4af483a68cd8faf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
