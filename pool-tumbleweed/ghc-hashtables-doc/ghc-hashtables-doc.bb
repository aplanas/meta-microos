SUMMARY = "Haskell hashtables library documentation"
DESCRIPTION = "This package provides the Haskell hashtables library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-doc-1.3.1-1.3.noarch.rpm"
RPM_HASH = "72a90d5a0962930abeb03d58c011c87d76f33384380f01812d06c3588822cf73220ced4e63c96bdf7f5482882425c596ee7377777d0218b6b226c64d73d4836e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
