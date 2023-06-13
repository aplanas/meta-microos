SUMMARY = "Haskell http-date library documentation"
DESCRIPTION = "This package provides the Haskell http-date library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-doc-0.0.11-2.3.noarch.rpm"
RPM_HASH = "7da8c090dc91eb613c883a0297db41cb416da0f256e8cf465765d0df3fab218446c3869befd42a08c7b31abdd9ba7a848f1986c075a1879103351836aa1e116b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-date-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
