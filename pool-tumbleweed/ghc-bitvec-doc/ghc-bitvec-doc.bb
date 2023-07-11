SUMMARY = "Haskell bitvec library documentation"
DESCRIPTION = "This package provides the Haskell bitvec library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-doc-1.1.4.0-1.6.noarch.rpm"
RPM_HASH = "74864b84066b6b34381bccd95b8eb8ce82413ad91480fa62d204db1e15707f26a110af1d80991a8c4543cbf691bf2797e7e4be1a754055b71153a5b99f256041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bitvec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
