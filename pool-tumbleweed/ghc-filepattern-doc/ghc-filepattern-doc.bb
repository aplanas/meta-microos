SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.11.noarch.rpm"
RPM_HASH = "058774d4dc2599a9dc8d6c9f0011690cbb877a95d17c4879f6c20c19c6b3ba1cd1e769e29c366ea0bc05be64a4775e941af9e3fef1dc3488ceca7fc7383ad0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
