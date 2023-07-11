SUMMARY = "Haskell postgresql-libpq library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-doc-0.9.5.0-2.7.noarch.rpm"
RPM_HASH = "ae5d0b712de1e7b1258f81694695732c47b5c0d9dd233991c423b9b2064ee0fbce8b9d8116cf53811d0a9f72180e7f71e044b8901ba905aa838a322215dcf619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-libpq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
