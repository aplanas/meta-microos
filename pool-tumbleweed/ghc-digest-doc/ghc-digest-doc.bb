SUMMARY = "Haskell digest library documentation"
DESCRIPTION = "This package provides the Haskell digest library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-doc-0.0.1.7-1.6.noarch.rpm"
RPM_HASH = "3a01bfd0f82e4df0e90f2e478894ce035967b649c75fc0007733601390a399509f262413c3ecc8182b747aaa6ea3075164c21e0a54e72eb46661abb79b549c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-digest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
