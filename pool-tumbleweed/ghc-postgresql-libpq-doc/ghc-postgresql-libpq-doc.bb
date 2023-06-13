SUMMARY = "Haskell postgresql-libpq library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-doc-0.9.5.0-2.3.noarch.rpm"
RPM_HASH = "f65f8d5cdb9e699877f1d68be22f277546c46a1335edb76e467434e8dc33427946edcfa8ec36aaff20c4d8824bf9711b41951d19ee63a62c8902e64e5938aabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-libpq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
