SUMMARY = "Haskell postgresql-libpq library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-doc-0.9.5.0-2.9.noarch.rpm"
RPM_HASH = "110fbde16c279bb4fef82f05e7a56dccca1561f05e7748bb1fe708e72c741fc81321a51125ba0726c048d2e7dd19f23ea4527a8c536c89905fefdb91bf8d27dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-libpq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
