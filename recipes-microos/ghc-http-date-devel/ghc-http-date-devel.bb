SUMMARY = "Haskell http-date library development files"
DESCRIPTION = "This package provides the Haskell http-date library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-devel-0.0.11-2.3.aarch64.rpm"
RPM_HASH = "bdd6b10bbb3cd4e5c2e5c6296544d04ed31d43095b5e1abe5277159877a71ab266e1fbf362b09d38da99adf0f4ce27628dfc90863ea8c6ee05e04365c44b9c41"

RPROVIDES:${PN} += "ghc-devel(http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD) \
ghc-http-date-devel \
ghc-http-date-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(time-1.12.2) \
ghc-http-date"

inherit rpm
